package com.seleniumtutorial;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Point p =new Point(200,200);
		d.manage().window().setPosition(p);
//		String s = d.getPageSource();
//		System.out.println(s);
		String c = d.getCurrentUrl();
		System.out.println(c);
		Dimension di = new Dimension(300, 300);
		d.manage().window().setSize(di);
		
	}

}
