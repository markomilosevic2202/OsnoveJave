package Dan10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.ebay.com/";
        driver.get(url);

        Select select = new Select(driver.findElement(By.name("_sacat")));
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("267");
        Thread.sleep(2000);
        select.selectByVisibleText("Business & Industrial");
        Thread.sleep(2000);
        driver.quit();
    }
}
//Napisati program koji ucitava stranicu https://www.ebay.com/ i bira kategoriju “Crafts”