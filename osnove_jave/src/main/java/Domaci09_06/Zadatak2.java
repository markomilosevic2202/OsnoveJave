package Domaci09_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Zadatak2 {

        public static void main(String[] args) throws InterruptedException {
            Scanner s = new Scanner(System.in);
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
            driver.get(url);
            for (int i = 4; i < 7; i++) {
                driver.findElement(By.xpath("//*[contains(@class,'add')]")).click();
                driver.findElement(By.name("name")).sendKeys("Marko Milosevic");
                driver.findElement(By.name("department")).sendKeys("QA");
                driver.findElement(By.name("phone")).sendKeys("123456");
                driver.findElement(By.xpath("//*[contains(@class,'table table-bordered')]/tbody/tr[" + i + "]/td[4]/a")).click();
                Thread.sleep(3000);

            }
            driver.close();
}}
//Napisati program koji vrsi dodavanje 5 reda u tabelu.
//Maksimizirati prozor
//Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//Dodati 5 redova sa istim podacima.Jedan red u jednoj iteraciji
//Klik na dugme Add New
//Unesite name,departmant i phone (uvek iste vrednost)
//Trazenje po name atributu
//Kliknite na zeleno Add dugme.
//PAZNJA: Pogledajte strukturu stranice i videcete da se u svakom redu poslednje kolone javljaju dugmici edit, add, delete ali zbog prirode reda neki dugmici se vide a neki ne.
//Morate da dohvatite uvek Add dugme iz poslednjeg reda tabele. Mozete koristeci index iz petlje, a mozete koristeci i last() fukncionalnost za xpath. Koristan link last mehnizma
//Cekanje od 0.5s
//Na kraju programa ugasite pretrazivac.