package com.seleniumtutorial;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.myntra.com/men-casual-shirts");
		d.manage().window().maximize();
		List<WebElement> p = d.findElements(By.xpath("//span[@class='product-strike'] /preceding-sibling::span"));
		List<Integer> a= new ArrayList<>();
		for (int i = 0; i < p.size(); i++) {
			String replaceAll = p.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);
		}
		int s = a.size();
		for (Integer price : a) {
			System.out.println(price);
		}
		System.out.println(s);
	}
	

}
