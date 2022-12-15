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
import org.openqa.selenium.support.ui.Select;

public class SingleDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d = new ChromeDriver(); // upcasting
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		WebElement a = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		a.click();
		Thread.sleep(15000); // delay 15 sec for next window
		WebElement b = d.findElement(By.name("firstname"));
		b.sendKeys("Ajith");
		WebElement c = d.findElement(By.name("lastname"));
		c.sendKeys("Kumar");
		WebElement e = d.findElement(By.name("reg_email__"));
		e.sendKeys("1234567890");
//		WebElement f = d.findElement(By.name("reg_email_confirmation__"));
//		f.sendKeys("ajith@gmail.com");
		WebElement g = d.findElement(By.name("reg_passwd__"));
		g.sendKeys("dfy745rty");
		WebElement h = d.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		h.click();
		// dropdown
		WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("15");
		WebElement month = d.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(11);
		WebElement year = d.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1998");
		WebElement i = d.findElement(By.name("websubmit"));
		i.click();
		// Screenshot

		TakesScreenshot sh = (TakesScreenshot) d;
		File z = sh.getScreenshotAs(OutputType.FILE);
		File x = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\error1.png");
		FileUtils.copyFile(z, x);

	}

}
