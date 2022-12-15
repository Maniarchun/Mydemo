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
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://testleaf.herokuapp.com/");
		d.manage().window().maximize();
		WebElement drop = d.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[14]"));
		drop.click();
		Thread.sleep(2000);
		Actions a = new Actions(d);
		WebElement drag = d.findElement(By.id("draggable"));
		WebElement dwon = d.findElement(By.id("droppable"));
		a.clickAndHold(drag).build().perform();
		a.moveToElement(drag).build().perform();
		a.release(dwon).build().perform();
		TakesScreenshot ts =(TakesScreenshot) d;
		File aa = ts.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\action1.png");
		FileUtils.copyFile(aa, ab);
	}

}
