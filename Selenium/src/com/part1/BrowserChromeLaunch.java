package com.part1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
											//("key","path of browser server")
		ChromeDriver driver=new ChromeDriver();
		
		/*	Edge Browser launch
		
		System.setProperty("webdriver.edge.driver", "C:\Users\91740\OneDrive\Desktop\Selenium\edgedriver_win64\msedgedriver.exe");
											//("key","path of browser server")
		EdgeDriver driver=new EdgeDriver();
		
		*/
	}

}
