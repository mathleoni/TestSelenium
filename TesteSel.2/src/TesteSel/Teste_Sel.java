/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteSel;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


/**
 *
 * @author leoni
 */
public class Teste_Sel {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void teste() throws InterruptedException{
        //System.setProperty("webdriver.chrome.driver", "/home/leoni/Desktop");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?gl=us&hl=en&pws=0&gws_rd=cr");// Google US
        Thread.sleep(5000);  // Tempo ms
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Lucy Rose Wiki");
        searchBox.submit();
        Thread.sleep(5000);  
        WebElement element = driver.findElement(By.className("rc"));
        String text = element.getText();
        System.out.println(text);
        driver.findElement(By.linkText("Next")).click();
        
        
         
   
    }
    public static void main(String[] args) throws InterruptedException{
        teste();
        
    }
    
}
