package Ihodl;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonoTech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/aryan/Selenium_setup/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://buyselltext.lusites.xyz/");
		

	}

}
