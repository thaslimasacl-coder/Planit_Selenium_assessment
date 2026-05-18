package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

    public static WebDriver driver;

    public void setup() {


        System.setProperty("webdriver.edge.driver", "C:\\Users\\AZBI\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://jupiter.cloud.planittesting.com");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}