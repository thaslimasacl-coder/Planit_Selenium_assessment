package tests;

import base.BaseTest;
import pages.ContactPage;

public class TestCase1 extends BaseTest {

    public static void main(String[] args) throws InterruptedException {

        BaseTest base = new BaseTest();
        base.setup();

        ContactPage contact = new ContactPage();

        // go to contact page
        contact.goToContactPage();

        Thread.sleep(2000);

        // click submit without data
        contact.clickSubmit();

        // verify errors
        System.out.println("Error shown: " + contact.isErrorDisplayed());

        // fill mandatory fields
        contact.enterMandatoryFields();

        Thread.sleep(2000);

        // verify errors gone
        System.out.println("Errors gone: " + !contact.isErrorDisplayed());

        base.tearDown();
    }
}
