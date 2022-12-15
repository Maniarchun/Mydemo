package com.seleniumtutorial;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01kahf3wo6fygcuv6mpx3m02e420685.node0");
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
		simpleAlert.click();
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert is Presented");
		} catch (Exception exception) {
			System.out.println("No alert");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
