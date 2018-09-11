/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteSel;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        //espera a página carregar resultados
        WebElement results =  (new WebDriverWait(driver, 10)).
                until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
     
        List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

        // links que aparecem no resultado da busca (após next pg)
        for (WebElement webElement : findElements) {
            System.out.println(webElement.getAttribute("href"));
            WebElement elemento2 = driver.findElement(By.className("rc"));
            String textoDef = elemento2.getText();
            System.out.println(textoDef);
            System.out.println("++++++++++++++\n");
        }

    }
    public static void main(String[] args) throws InterruptedException{
        teste();
        
    }
    
}
