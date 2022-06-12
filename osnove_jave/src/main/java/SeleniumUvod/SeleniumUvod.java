package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUvod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cms.demo.katalon.com/");
        driver.
                findElement(By.xpath("//input")).
                        sendKeys("Flying Ninja");


    }
}
//Maksimizuje prozor
//Ucitava stranicu https://cms.demo.katalon.com/
//U delu za pretragu unosi tekst Flying Ninja. Xpath za trazenje ovog elementa treba da bude preko name atributa
//Klikce na dugme za pretragu. Dugme sa lupom. Kada trazite element dohvatite element koji je po tagu button a ne span. Xpath za trazenje ovog elementa treba da bude preko class atributa.
//Ceka 5 sekuni
//Zatvara pretrazivac