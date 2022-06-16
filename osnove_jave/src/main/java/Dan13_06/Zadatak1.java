package Dan13_06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        String url = "https://docs.katalon.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement t=driver.findElement(By.xpath("//*[@class='plugin-pages plugin-id-default']"));
        if(t.getAttribute("data-theme").equals("light")){
            System.out.println("Tema je svetla");
        }else {
            System.out.println("Tema je mracna");
        };
        driver.findElement(By.xpath("//*[contains(@class,'clean-btn toggleButton_rCf9')]")).click();
       if(driver.findElement(By.xpath("//*[@class='plugin-pages plugin-id-default']"))
                          .getAttribute("data-theme").equals("dark")){
           System.out.println("Tema je mracna");
       }else {
           System.out.println("Tema je svetla");
       };
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();
        Thread.sleep(5000);
       if(driver.findElement(By.xpath("//*[contains(@class,'DocSearch-Input')]")).
                             getAttribute("type").equals("search")){
            System.out.println("Sve je ok");
        }
        else {
           System.out.println("Nesto ne valja:)");
       }

        driver.quit();
    }}
///Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
//Implicitno cekanje za trazenje elemenata je maksimalno 10s
//Implicitno cekanje za ucitavanje stranice je 5s
//Ucitava stranicu https://docs.katalon.com/
//Maksimizuje prozor
//Od html elementa cita data-theme atribut.
//Korisni linkovi za citanje vrednosti atributa link1 i link2
//Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
//Klikce na dugme za zamenu tema
//Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
//Izvrsava kombinaciju tastera CTRL + K. Koristan link  za keyboard actions…kako izvrsavati precice preko Actions objekta
//Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
//Zatvara pretrazivac