package Dan13_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        driver.get("https://www.file.io/");
        driver
                .findElement(By.id("upload-button"))
                .sendKeys(
                        new File("src/main/resources/FACEBOOK_POST_KORISNIK.png")
                                .getAbsolutePath());


//        Thread.sleep(10000);
//        driver.quit();
}}
//Napisati program koji ucitava stranicu https://www.file.io/ aploaduje fajl
//(ZA vezbanje)
//Probajte upload razlicitih fajlova, npr:
//fajl velciine 20mb => mozete da ga napravite tako sto zipujete grupu nekih fajlova, slika …