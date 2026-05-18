package tests;

import base.BaseTest;
import pages.ContactPage;

public class TestCase2 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Run number: " + i);

            BaseTest base = new BaseTest();
            base.setup();

            ContactPage contact = new ContactPage();

            // go to contact page
            contact.goToContactPage();

            Thread.sleep(2000);

            // fill mandatory fields
            contact.enterMandatoryFields();

            // submit
            contact.clickSubmit();

            Thread.sleep(2000);

            // verify success
            System.out.println("Success message: " + contact.isSuccessMessageDisplayed());

            base.tearDown();

            System.out.println("Test completed: " + i);
            System.out.println("------------------------");
        }
    }
}