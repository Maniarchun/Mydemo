package com.seleniumtutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robote {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement z = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		z.click();
		Actions a =new Actions(d);
		Robot r = new Robot();
		WebElement gros = d.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		a.contextClick(gros).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mob = d.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		a.contextClick(mob).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement trv = d.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
		a.contextClick(trv).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// WINDOWS HANDLING
		Set<String> wh = d.getWindowHandles();
		for (String tab : wh) {
			String title = d.switchTo().window(tab).getTitle();
			System.out.println(title);
		}
		String title2 ="Electronics Big Saving Days Sale Store Online - Buy Electronics Big Saving Days Sale Online at Best Price in India | Flipkart.com";
		for (String t2 : wh) {
			if(d.switchTo().window(t2).getTitle().equalsIgnoreCase(title2)) {
			break;
			}
		}
	}
}
