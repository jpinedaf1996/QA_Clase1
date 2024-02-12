package com.litethinking;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://www.google.com/";
        // Abre la página en el navegador
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement textArea = driver.findElement(By.id("APjFqb"));
        WebElement button = driver.findElement(By.name("btnK"));
        
        textArea.sendKeys("Facebook");
        button.click();

        System.out.println("Titulo de la pagina: " + driver.getTitle());
        
        //Valida el titutlo de la pagina 
        if (driver.getTitle().equals("pruebas")) {
            System.out.println("El titulo orrecto!");
        }else{
            System.out.println("x - El titulo no es correcto");      
             
        }
        driver.quit();
    }
}