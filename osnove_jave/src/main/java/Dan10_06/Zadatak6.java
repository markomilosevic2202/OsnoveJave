package Dan10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak6 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("file:///C:/Users/Korisnik/Downloads/Zadatak6.html");
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("showInBtn")).click();
            driver.findElement(By.id("id-" + i));
        }
        driver.close();

    }
}
//Napisati program koji ucitava stranicu Zadatak6.html
//I na stranici dodaje 5 poruka “IT Bootcamp”
//Potrebno  je u svakoj iteraciji kliknuti na dugme Show in
//Sacekati da se novi element pojavi pre nego sto se doda sledeci