package Ihodl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class Selenium {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","/home/aryan/Selenium_setup/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ihodl.lusites.xyz/");
        driver.findElement(By.name("email")).sendKeys("isk@yopmail.com");
        Thread.sleep(2200);
        driver.findElement(By.name("password")).sendKeys("Qwer@123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);
        WebElement search =driver.findElement(By.cssSelector("input[placeholder='search']"));
        search.click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='search']")).sendKeys("3PypCGBC3ij7iNARYHsdWPtDSXeBa7MfNP");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='outline-none w-w20']")).click();
        		
        
        
	}

}
