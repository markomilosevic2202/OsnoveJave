package Domaci10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {

        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        String url = "https://geodata.solutions/";
        driver.get(url);
        Select selectCountry = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> opCountry = selectCountry.getOptions();
        opCountry.get(r.nextInt(opCountry.size())).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select selectState = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> opState = selectState.getOptions();
        opState.get(r.nextInt(opState.size())).click();
      //  WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
            //    .until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//a/h3")));
        Select selectCity = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> opCity = selectCity.getOptions();
        opCity.get(r.nextInt(opCity.size())).click();
        Thread.sleep(4000);
        driver.quit();
}

}
//Napisati program koji ucitava stranicu https://geodata.solutions/
//Bira proizvoljan Country, State i City
//Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//Izabrerit Country, State i City tako da imate podatke da selektujete!