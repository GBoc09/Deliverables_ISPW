package com.example.projectseleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;

// page_url = https://www.jetbrains.com/
public class Medals {

    public int getTokyoMedals() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://it.wikipedia.org/wiki/Italia_ai_Giochi_della_XXXII_Olimpiade");
        WebElement webBadges = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[4]/text()[1]"));
        int medals = Integer.valueOf(webBadges.getText());
        driver.close();
        return medals;
    }

    public int getLAMedals() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://it.wikipedia.org/wiki/Giochi_della_X_Olimpiade");
        WebElement webBadges = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[8]/text()"));
        int medals = Integer.valueOf(webBadges.getText());
        driver.close();
        return medals;
    }

    public static void main(String args[]) throws InterruptedException {

    }
}
