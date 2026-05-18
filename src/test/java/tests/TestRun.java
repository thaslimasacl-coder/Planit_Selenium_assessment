package tests;

import base.BaseTest;

public class TestRun {

    public static void main(String[] args) throws InterruptedException {

        BaseTest base = new BaseTest();

        base.setup();

        System.out.println("Browser opened successfully");

        Thread.sleep(5000); // ⬅️ ADD WAIT HERE (5 seconds)

        base.tearDown();
    }
}