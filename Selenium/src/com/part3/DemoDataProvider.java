package com.part3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	@Test(dataProvider="dataSupplier")
	public void login(String username,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
	@DataProvider
	public Object[][] dataSupplier() {
		Object objarr[][]=new Object[3][2];
		objarr[0][0]="admin";
		objarr[0][1]="manager";
		objarr[1][0]="admin1";
		objarr[1][1]="manager1";
		objarr[2][0]="admin2";
		objarr[2][1]="manager2";
		return objarr;
	}
}