package SeleniumUvod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Dan09_06Z3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ArrayList<String> pages = new ArrayList<>();
        pages.add("https://google.com/");
        pages.add("https://youtube.com/");
        pages.add("https://www.ebay.com/");
        pages.add("https://www.kupujemprodajem.com/");

        for (int i = 0; i < pages.size(); i++) {
            driver.navigate().to(pages.get(i));
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}
//Napisati program koji ima:
//Niz stranica (niz stringova) koje treba da ucita. Niz je:
//https://google.com/
//https://youtube.com/
//https://www.ebay.com/
//https://www.kupujemprodajem.com/
//Program petljom prolazi kroz niz stranica i svaku stranicu ucitava preko get ili navigate i od svake stranice na ekranu ispisuje naslov stranice. Kako od stranice procitati naslov imate na ovom linku
//U prevodu u konzoli treba da se ispisu:
//Google
//YouTube
//Electronics, Cars, Fashion, Collectibles & More | eBay
//KupujemProdajem
//Zatvara pretrazivac