package com.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaTable {
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
	}
	public static void allHeader() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("----------All Head------------");
		List<WebElement> allHead = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (WebElement header : allHead) {
			System.out.println(header.getText());
		}
	}
	public static void allData() {
		System.out.println("-------All Data----------");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td"));
		System.out.println(alldata.size());
	}
	public static void allRow() {
		System.out.println("--------All Row----------");
		List<WebElement> allRow = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td"));
		for (WebElement rowdata : allRow) {
			System.out.println(rowdata.getText());
		}
	}
	public static void allColum() {
		System.out.println("-------All colum----------");
		List<WebElement> allClm = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td[15]"));
		System.out.println(allClm.size());
	}
	public static void particlurData() {
		System.out.println("--------Particular Data---------");
		WebElement data = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td[15]"));
		System.out.println(data.getText());
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		allHeader();
		allData();
		allRow();
		allColum();
		particlurData();
		
	}
}
