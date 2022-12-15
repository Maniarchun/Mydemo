package com.seleniumtutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		WebElement m1 = d.findElement(By.xpath("//button[@class='btn btn-danger']"));
		m1.click();
		d.switchTo().alert().accept();
		WebElement m2 = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		m2.click();
		WebElement m3 = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
		m3.click();
		d.switchTo().alert().dismiss();
		WebElement m4 = d.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		m4.click();
		WebElement m5 = d.findElement(By.xpath("//button[@class='btn btn-info']"));
		m5.click();
		d.switchTo().alert().sendKeys("Manikandan");
		d.switchTo().alert().accept();
		TakesScreenshot ts = (TakesScreenshot) d;
		File sh = ts.getScreenshotAs(OutputType.FILE);
		File sa = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\alert.png");
		FileUtils.copyFile(sh, sa);
	}

}
