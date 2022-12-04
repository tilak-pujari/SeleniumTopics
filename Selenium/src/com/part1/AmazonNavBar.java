package com.part1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonNavBar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String url="https://www.amazon.in/";
		driver.navigate().to(url);

		List<WebElement> allfeatures=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(WebElement feature:allfeatures) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver1.manage().window().maximize();
			driver1.navigate().to(url);
			feature.click();
			String title=driver1.getTitle();
			System.out.println(title);
			driver1.close();
			break;
		}
		
	}

}
