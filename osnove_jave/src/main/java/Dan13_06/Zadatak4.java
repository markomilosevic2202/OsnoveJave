package Dan13_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://s.bootsnipp.com/iframe/klDWV");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.findElement(By.id("")).getText()
//        driver.findElement(By.id("")).getAttribute("id")
//        wait.until(ExpectedConditions.attributeToBe(By.className(""), "text", "100%"))
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader-wrap")));
//        wait.until(ExpectedConditions
//                .attributeToBe(
//                        By.className("preloader-wrap"),
//                        "style",
//                        "display: none;"));

//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("precent"), "100%"));
        wait.until(ExpectedConditions.textToBe(By.id("precent"), "100%"));
        System.out.println("KRAJ");

    }
}
//Napisati program koji ucitava stranicu https://s.bootsnipp.com/iframe/klDWV i ceka da se ucita progress
// bar na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”