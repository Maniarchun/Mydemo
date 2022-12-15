package com.seleniumtutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
//	ChromeDriver d = new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().window().maximize();
	TakesScreenshot ts =(TakesScreenshot)d;
	File sc = ts.getScreenshotAs(OutputType.FILE);
	File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\ss5.png");
	FileUtils.copyFile(sc, file);
}
}
