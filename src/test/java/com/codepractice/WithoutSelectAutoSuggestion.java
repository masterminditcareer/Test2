package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectAutoSuggestion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ps4");

List<WebElement>listing=driver.findElements(By.xpath("//div[@id='suggestions']//div"));
	System.out.println(listing.size());


for(int i=0;i<listing.size();i++) {
	listing.get(11).click();
}
	
	
	
	}

}
