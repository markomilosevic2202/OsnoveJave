package Domaci13_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Random;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int bojKonfete = r.nextInt(5)+1;
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

       for (int i = 1; i < 5; i++) {

            driver.findElement(By.xpath(" //*[contains(@class, 'kzfKVg')]/div[" + i + "]/div/img")).click();

            driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();
            driver
                    .findElement(By.id("imageUpload"))
                    .sendKeys(
                            new File("src/main/resources/Picture" + (i) + ".jpg")
                                    .getAbsolutePath());
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//*[@class='sc-ftvSup kAzmBp']/div[" + i + "]/div/img")));
            driver.findElement(By.xpath("//*[@class='sc-ftvSup kAzmBp']/div[" + i + "]/div/img")).click();
            // Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@class='sc-gFGZVQ ezVUKM']/button[1]")).click();
        }
         driver.findElement(By.xpath("//*[@class='sc-gHLcSH fajlzv']/div[" + bojKonfete + "]")).click();
         driver.findElement(By.xpath("//*[@class='sc-bczRLJ jtbzvh']")).click();
        if(elementExist(driver, By.xpath("//*[@action='error']"))){
            System.out.println("Izbacuje gresku sve je ok");
        }
        else {
            System.out.println("Ne izbacuje gresku");
        }
        Thread.sleep(3000);
        driver.quit();
    }


    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
//Zadatak
//Napisati program koji ima:
//Podesava:
//implicitno cekanje za trazenje elemenata od 10s
//implicitno cekanje za ucitavanje stranice od 10s
//eksplicitno cekanje podeseno na 10s
//Podaci:
//Potrebno je u projektu ukljuciti 4 slike.
//Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
//Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
//Koraci:
//Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
//Maksimizuje prozor
//Selektuje Image - Front klikom na tu karticu u dnu ekrana
//Klik na add photo iz levog navigacionog menia
//Upload slike. Upload preko File objekta koristeci getAbsolutePath
//Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
//Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
//Ceka da dijalog bude vidljiv
//Klik na Use One Side Only dugme
//Ponoviti proces za Left, Right i Back
//Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
//Kliknuti na Add To Cart dugme
//Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
//Xpath: //*[@action='error']
//Zatvorite pretrazivac