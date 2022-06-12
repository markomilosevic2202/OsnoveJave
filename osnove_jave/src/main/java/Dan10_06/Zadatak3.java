package Dan10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.ebay.com/";
        driver.get(url);
        //driver.findElement(B)
        Select s = new Select(driver.findElement(By.name("_sacat")));
        // getting the list of options in the dropdown with getOptions()
        List<WebElement> op = s.getOptions();
        Random rand = new Random();

        op.get(rand.nextInt(op.size())).click();

        Thread.sleep(5000);
        driver.close();
    }
}

//Napisati program koji:
//Ucitava stranicu  https://www.ebay.com/
//Zatim iz selekta za kategoriju povlaci sve opcije. Koristan link
//Zatim bira random element iz niza opcija koristeci Random. Vodite racuna da random element bude u opsegu broja elemenata niza. Random podsetnik
//Selektuje random kategoriju izabranu u koraku iznad
//Zatvara pretrazivac