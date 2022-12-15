package com.seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.javatpoint.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
	WebElement java = d.findElement(By.xpath("/html/body[1]/div[1]/div[1]/div[3]/div/ul/li[3]/a"));
	java.click();
	WebElement q = d.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[19]/a[22]"));
	q.click();
	WebElement a = d.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[2]/a[2]"));
	a.click();
	WebElement m = d.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
	m.getText();
} 
}
