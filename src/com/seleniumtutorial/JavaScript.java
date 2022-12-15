package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	JavascriptExecutor j = (JavascriptExecutor)d;
	WebElement id = d.findElement(By.id("email"));
	j.executeScript("arguments[0].value='nbcxrtyuijknbv'",id);
	WebElement pass = d.findElement(By.id("pass"));
	j.executeScript("arguments[0].value='1234567'", pass);
	WebElement in = d.findElement(By.name("login"));
	j.executeScript("arguments[0].click()", in);
}
}
