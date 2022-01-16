package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaCollectionPractice {
  
	public static void main(String[] args) {
		
		//WebDriver obj = new webDriver();
	//ChromeDriver obj = new ChromeDriver();
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com//");
	}


}
