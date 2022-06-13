package Domaci10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {


    Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.get(url);
        List<WebElement> elementi = new ArrayList<>();
        elementi = driver.findElements(By.className("close"));
        for (int i = elementi.size(); i > 0; i--) {
            driver.findElement(By.xpath("//*[@class='col-md-12']/div[" + i + "]"));
            driver.findElement(By.xpath("//*[@class='col-md-12']/div[" + i + "]/button")).click();
            if(!elementExist(driver,By.xpath("//*[@class='col-md-12']/div[" + i + "]"))){
                System.out.println("Uspesno obrisano");
            }
            else {
                System.out.println("Neuspesno obrisano");
            }

        }

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
//Napisati program koji:
//Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//POMOC: Brisite elemente odozdo.
//(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo