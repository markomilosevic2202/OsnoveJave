package UvodTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonLoginTests {
    private WebDriver driver;
    private String baseUrl = "https://cms.demo.katalon.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }


    @Test(priority = 10)
    public void visitLoginPageFromNavBar() {

        driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[3]/a")).click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(
                driver.getTitle(),
               "My account – Katalon Shop",
                "[ERROR] Nije otisao na stranicu my acaount.");


        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "Url does not contain '/my-account'");


    }

    //Ucitati home stranicu
    //Kliknuti na My account link
    //Verifikovati da je naslov stranice My account – Katalon Shop
    //Verifikovati da se u url-u stranice javlja /my-account
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske

    @Test(priority = 20)
    public void checkInputTypes() {
        driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[3]/a")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='username']"))
                .getAttribute("type"),"text","[ERROR] Type input username not text.");

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='password']"))
                .getAttribute("type"),"password","[ERROR] Type input username not password.");

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='rememberme']"))
                .getAttribute("type"),"checkbox","[ERROR] Type input username not checkbox.");

        Assert.assertFalse(driver.findElement(By.xpath("//*[@id='rememberme']"))
                .isSelected(),"[ERROR] Checkbox is selected.");

    }
    //Ucitati /my-account stranicu
//Verifikovati da  polje za unos email-a za atribu type ima vrednost text
//Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//Verifikovati da checkbox Remember me za atribut type ima vrednost checkbox
//Verifikovati da je Remember me checkbox decekiran. Koristan link kako naci informaciu da li je checkbox cekiran ili ne.
//Za sve validacije ispisati odgovarajuce poruke u slucaju greske
    @Test(priority = 30)
    public void credentials() throws InterruptedException {
        String email = "invalidemail@gmail.com";
        String pass = "invalid123";
        driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@class='woocommerce-button button woocommerce-form-login__submit']")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@class='woocommerce-error']")),
                "[ERROR] The message does not exist ");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='woocommerce-error']")).getText().contains("Invalid email address"),
                "[ERROR] The message does not conteins Invalid email ");
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "Url does not contain '/my-account'");

        Thread.sleep(3000);
    }
//Ucitati /my-account stranicu
//Unesite email
//Unesite password
//Kliknite na login dugme
//Verifikovati da postoji element koji prikazuje gresku
//Verifikovati da je prikazana greska ERROR: Invalid email address
//Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//Verifikovati da smo idalje na login stranici posle greske, tako sto proveravamo da se url-u javlja /my-account


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
