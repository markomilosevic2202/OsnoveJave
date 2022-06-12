package Dan10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://demoqa.com/login";
        driver.navigate().to(url);

        driver.findElement(By.id("userName")).sendKeys("itbootcamp");
        driver.findElement(By.id("password")).sendKeys("ITBootcamp2021!");
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
        if (elementExist(driver, By.xpath("//button[text()='Log out']"))) {
            driver.findElement(By.xpath("//button[text()='Log out']")).click();
            System.out.println("Uspesno ste se logovali");
        } else {
            System.out.println("Niste se uspesno logovali");
        }

        driver.close();

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
//Ucitava stranicu https://demoqa.com/login
//Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//Zatim ceka 5sekundi da se korisnik uloguje
//Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout. Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//Klikce na dugme za logout
//Gasi stranicu