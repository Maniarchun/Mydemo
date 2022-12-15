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

public class Adactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://adactinhotelapp.com/index.php");
		w.manage().window().maximize();
		WebElement a = w.findElement(By.id("username"));
		a.sendKeys("maniarjun");
		WebElement b = w.findElement(By.id("password"));
		b.sendKeys("maniarjun@1234");
		WebElement c = w.findElement(By.id("login"));
		c.click();
		Thread.sleep(5000);
		WebElement location = w.findElement(By.id("location"));
		Select  s1  = new Select (location);
		s1.selectByValue("Los Angeles");
		WebElement hotel = w.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");
		WebElement type = w.findElement(By.id("room_type"));
		Select s3 = new Select(type);
		s3.selectByValue("Super Deluxe");
		WebElement room = w.findElement(By.id("room_nos"));
		Select s4 = new Select(room);
		s4.selectByValue("1");
		WebElement in = w.findElement(By.id("datepick_in"));
		in.clear();
		in.sendKeys("3/08/2022");
		WebElement out = w.findElement(By.id("datepick_out"));
		out.clear();
		out.sendKeys("5/08/2022");
		WebElement adult = w.findElement(By.id("adult_room"));
		Select s5 = new Select (adult);
		s5.selectByValue("3");
		WebElement child = w.findElement(By.id("child_room"));
		Select s6= new Select(child);
		s6.selectByValue("1");
		WebElement s7 = w.findElement(By.id("Submit"));
		s7.click();
//		TakesScreenshot aa =(TakesScreenshot) w;
//		File ab = aa.getScreenshotAs(OutputType.FILE);
//		File ac = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\ss1.png");
//		FileUtils.copyFile(ab, ac);
		Thread.sleep(5000);
		WebElement s8 = w.findElement(By.xpath("//input[@name='radiobutton_0']"));
		s8.click();
		WebElement s9 = w.findElement(By.xpath("//input[@type='submit']"));
		s9.click();
		Thread.sleep(5000);
		WebElement m1 = w.findElement(By.xpath("//input[@name='first_name']"));
		m1.sendKeys("Rayappan");
		WebElement m2 = w.findElement(By.xpath("//input[@name='last_name']"));
		m2.sendKeys("Bigil");
		WebElement m3 = w.findElement(By.id("address"));
		m3.sendKeys("Chennai, Delli, India");
		WebElement m4 = w.findElement(By.xpath("//input[@name='cc_num']"));
		m4.sendKeys("7654766534873460");
		WebElement card = w.findElement(By.xpath("//select[@name='cc_type']"));
		Select m5 = new Select(card);
		m5.selectByValue("VISA");
		WebElement month = w.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select m6 = new Select(month);
		m6.selectByValue("11");
		WebElement yr = w.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select m7 = new Select(yr);
		m7.selectByValue("2022");
		WebElement m8 = w.findElement(By.xpath("//input[@name='cc_cvv']"));
		m8.sendKeys("765");
		WebElement m9 = w.findElement(By.xpath("(//input[@type='button'])[1]"));
		m9.click();
		Thread.sleep(5000);
		WebElement m10 = w.findElement(By.id("logout"));
		m10.click();
		TakesScreenshot aa =(TakesScreenshot) w;
		File ab = aa.getScreenshotAs(OutputType.FILE);
		File ac = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ScrnShot\\ss2.png");
		FileUtils.copyFile(ab, ac);
	}

}
