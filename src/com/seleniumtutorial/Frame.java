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

public class Frame {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe" );
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		WebElement s1 = d.findElement(By.id("singleframe"));
		d.switchTo().frame(s1);
		WebElement t1 = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		t1.sendKeys("Manikandan");
		d.switchTo().defaultContent();
		WebElement s2 = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		s2.click();
		WebElement t2 = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(t2);
		WebElement t3 = d.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		d.switchTo().frame(t3);
		WebElement s3 = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		s3.sendKeys("Selenium");
		TakesScreenshot ts = (TakesScreenshot) d;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File sc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\frame.png");
		FileUtils.copyFile(ss, sc);
	}

}
