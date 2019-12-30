package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		
		// Lunching url
		driver.get(url);
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		if (url.equals(currentUrl)) {
			
			System.out.println(true);
			
		}
		else
		{
			System.out.println(false);
		}
		
		WebElement testName = driver.findElement(By.id("email"));
		testName.sendKeys("Mani");
		WebElement textPass = driver.findElement(By.id("pass"));
		textPass.sendKeys("Kandan");
		WebElement btn = driver.findElement(By.id("u_0_4"));
		btn.click();
		
	}

}
