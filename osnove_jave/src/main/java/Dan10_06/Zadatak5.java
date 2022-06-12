package Dan10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://demoqa.com/modal-dialogs";
        driver.navigate().to(url);
        driver.findElement(By.id("showLargeModal")).click();
        Thread.sleep(3000);
        if (elementExist(driver,By.id("example-modal-sizes-title-lg"))){
            System.out.println("Sve je ok");
        }
        else {
            System.out.println("Nesto zebava :)");
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
//Ucitati stranicu https://demoqa.com/modal-dialogs
//gme Large modal
//Proverite da li se prikazao dijalog i ispisite u konzoli odgovarajuce poruke