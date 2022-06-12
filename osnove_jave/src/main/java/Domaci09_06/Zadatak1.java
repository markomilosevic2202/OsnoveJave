package Domaci09_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.get(url);
        List<WebElement> number =
                driver.findElements(By.xpath("//*[contains(@id,'rating-star')]"));
        System.out.println("Unesite br zvezdica:");
        int br = s.nextInt();
        for (int i = 0; i < br; i++) {
            number.get(i).click();
            Thread.sleep(2000);
        }
        driver.close();


    }
}
//Maksimizirati prozor
//Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//Dohvatite dugmice za rejting kao listu. XPath za trazenje treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
//Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//I izvrsite akciju klik na odgovarajuci element preko indeksa
//Na kraju programa ugasite pretrazivac.