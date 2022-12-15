package com.seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/");
		d.manage().window().maximize();
		WebElement a = d.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]"));
		a.click();
		Thread.sleep(5000);
		WebElement b = d.findElement(By.xpath("(//select)[6]"));
		Select c = new Select(b);
		c.selectByValue("1");
		c.selectByIndex(3);
		c.selectByVisibleText("Loadrunner");
		boolean m = c.isMultiple();
		System.out.println("Is Multiple : "+m);
		System.out.println("**********************");
		List<WebElement> options = c.getOptions();
		System.out.println(" Get Option");
		for (WebElement w : options) {
			String t1 = w.getText();
			System.out.println("  "+t1);
		}
		System.out.println("**********************");
		System.out.println(" Get All Selected Option");
		List<WebElement> allSelectedOptions = c.getAllSelectedOptions();
		for (WebElement w1 : allSelectedOptions) {
			String t2 = w1.getText();
			System.out.println("  "+t2);
		}
		System.out.println("**********************");
		WebElement f1 = c.getFirstSelectedOption();
		String t3 = f1.getText();
		System.out.println(" Get First Selected Option");
		System.out.println("  "+t3);
		System.out.println("**********************");
	}
}
