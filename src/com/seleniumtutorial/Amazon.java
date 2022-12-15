package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.amazon.in/");
		a.manage().window().maximize();
		WebElement b = a.findElement(By.id("twotabsearchtextbox"));
		b.sendKeys("Watch");
		Dimension di = new Dimension(500, 500);
		a.manage().window().setSize(di);
	}

}
