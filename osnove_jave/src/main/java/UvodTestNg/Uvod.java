package UvodTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Uvod {
    private WebDriver driver;
    private String baseUrl = "https://www.google.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }


    @Test (priority = 10)
    public void googleTitleTest() {
        Assert.assertTrue(driver.getTitle().contains("Google"),
                "[ERROR] Page title does not contain 'Google1'");

        driver.get(baseUrl + "/");
        driver.get(baseUrl + "/login");
        driver.get(baseUrl + "/register");
//        Assert.assertEquals(
//                driver.getTitle(),
//                "Google",
//                "[ERROR] Page title is not valid.");
        String actualSearchType = driver.findElement(By.name("q")).getAttribute("type");

        Assert.assertEquals(
                actualSearchType,
                "text",
                "[ERROR] Input search is not type text.");

    }
    @Test(priority = 20)
    public void googleUrlTest() {

        if (driver.getCurrentUrl().contains("google.com")) {
            System.out.println("OK");
        } else {
            System.out.println("Nije ok.");
        }


    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
