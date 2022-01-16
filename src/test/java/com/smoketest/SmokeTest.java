package com.smoketest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

	
	public static void main(String[] args) {
		//webDriver obj = new webDriver();
	//ChromeDriver obj = new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com//");
	}
	
	
}
