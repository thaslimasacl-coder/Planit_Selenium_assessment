package tests;

import base.BaseTest;
import org.openqa.selenium.By;

public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {

        BaseTest base = new BaseTest();
        base.setup();

        // Go to Shop
        base.driver.findElement(By.linkText("Shop")).click();

        Thread.sleep(2000);

        // Add products
        addItem("Stuffed Frog", 2);
        addItem("Fluffy Bunny", 5);
        addItem("Valentine Bear", 3);

        // Go to Cart
        Thread.sleep(2000);

        base.driver.findElement(By.xpath("//a[@href='#/cart']")).click();

        Thread.sleep(3000);

        System.out.println("Cart opened successfully");

        // Close browser
        base.tearDown();
    }

    public static void addItem(String productName, int quantity) {

        for (int i = 0; i < quantity; i++) {

            BaseTest.driver.findElement(
                    By.xpath("//h4[text()='" + productName + "']/following-sibling::p/a")
            ).click();
        }

        System.out.println(productName + " added: " + quantity);
    }
}