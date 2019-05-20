package com.cybertekk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
public static void main(String[] args) throws InterruptedException {
	// open browser
	
	System.setProperty("webdriver.chrome.driver","/Users/Tek/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		//driver.manage().
//		//go to url
//		driver.get("http://google.com");
//		
//	// 3. verify
//		String expected="goo";
//		String actual=driver.getTitle();
//		if(expected.equals(actual)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//			System.out.println("Expected:\t" +expected);
//		    System.out.println("Actual:\t"+actual);
//		}
//		
//		driver.get("http://cybertekschool.com");
//		String expected1="https://cybertekschool.com/";
//		
//		String actual1=driver.getCurrentUrl();
//		if(expected1.contains(actual1)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//			System.out.println("Expected:\t" +expected1);
//		    System.out.println("Actual:\t"+actual1);
//		}
//		driver.navigate().to("http://google.com");
//
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
///////////////////////////////////////////////////////////////////
//		Thread.sleep(2000);
		driver.get("http://newtours.demoaut.com");
		
		WebElement kyy = driver.findElement(By.name("userName"));
		kyy.sendKeys("tutorial");
		
		
		WebElement jj=driver.findElement(By.name("password"));
	    jj.sendKeys("tutorial");
		
		WebElement ky=driver.findElement(By.cssSelector("input[name='login']"));
		             // driver.findElement(By.xpath("//input[@name='login']"));
		ky.click();
		String actual=driver.getTitle();
		System.out.println(actual);
		String exp="Find a Flight";
		if(actual.contains(exp)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
}
}
