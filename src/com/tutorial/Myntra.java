package com.tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static WebDriver driver;
	static int miniPrice;
	static String brandName, subTitle;
	public static void browserLunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}
	public static void totalNumberOfProduct() {
		Actions a = new Actions(driver);
		WebElement kid = driver
				.findElement(By.xpath("//nav[@class='desktop-navbar']//ancestor::a[@href='/shop/kids']"));
		a.moveToElement(kid).build().perform();
		driver.findElement(By.xpath("//div[@data-reactid='334']//ancestor::a[@data-reactid='345']")).click();
		System.out.println("Total Nuber Of Showing Product : "
				+ driver.findElements(By.xpath("//li[@class='product-base']")).size());
	}
	public static Integer minimumPrice() {
		List<Integer> priceList = new ArrayList<>();
		List<WebElement> allPriceElement = driver.findElements(
				By.xpath("//li[@class='product-base']//ancestor::span[@class='product-discountedPrice']"));
		for (WebElement priceElement : allPriceElement) {
			String priceText = priceElement.getText().replaceAll("Rs. ", "");
			Integer price = Integer.valueOf(priceText);
			priceList.add(price);
		}
		miniPrice = Collections.min(priceList);
		System.out.println("Minimum Price Of The Showing Product : " + miniPrice);
		return miniPrice;
	}
	public static String minimumPriceBrandName(int price) {
		WebElement brandNameElement = driver.findElement(By.xpath("//li[@class='product-base']//ancestor::span[text()='"
				+ price + "']//ancestor::div[@class='product-productMetaInfo']/h3"));
		brandName = brandNameElement.getText();
		System.out.println("Brand Name Of minimum price : "+brandName);
		return brandName;
	}
	public static String productSubTitile(int price, String brand) {
		WebElement subTitleElement = driver.findElement(By.xpath("//li[@class='product-base']//ancestor::span[text()='"+price+"']//ancestor::div[@class='product-productMetaInfo']//h3[text()='"+brand+"']/following-sibling::h4[1]"));
		subTitle = subTitleElement.getText();
		System.out.println("Subtitle of minimum price Brand : "+subTitle);
		return subTitle;
	}

	public static void main(String[] args) {
		browserLunch();
		totalNumberOfProduct();
		minimumPrice();
		minimumPriceBrandName(miniPrice);
		productSubTitile(miniPrice,brandName);
	}

}
