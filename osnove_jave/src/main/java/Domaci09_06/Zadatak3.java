package Domaci09_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.calculatorsoup.com/calculators/math/basic.php";
        driver.get(url);
        System.out.println("Unesite formulu");
        String unos = s.next();
        List<Character> chars = new ArrayList<>();
        for (char ch : unos.toCharArray()) {

            chars.add(ch);
        }
        for (int i = 0; i < chars.size(); i++) {
            driver.findElement(By.xpath("//input[@value='" + chars.get(i) + "']")).click();
            Thread.sleep(1000);
        }

        driver.close();


    }
}
//Napisati program koji matematicku formulu koju korisnik unese izvrsaav na stranici:
//Ucitati stranicu https://www.calculatorsoup.com/calculators/math/basic.php
//Korisnik unosi formulu, samo osnovne matematicke operacija, npr:
//1243+329=
//21912-4=
//12913÷4=
//U programu se formula unosi kao jedan string i potrebno je razbiti formulu na karaktere. Za to imate metodu
//Zatim u odnosu na karakter uradite odredjenu logiku