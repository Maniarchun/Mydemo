package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement x = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		x.click();
		JavascriptExecutor j =(JavascriptExecutor)d;
//		j.executeScript("window.scrollBy(0,1000)");
		WebElement s = d.findElement(By.xpath("//div[@class='_3-dnWo']"));
		j.executeScript("arguments[0].scrollIntoView()", s);
		
	}
}
