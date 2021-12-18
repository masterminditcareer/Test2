package com.codepractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.codedpractice.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement source=	driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement target=driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));

		Actions ac=new Actions(driver);
		ac.moveToElement(source).moveToElement(target).click().build().perform();
		ScreenShot.screen(driver, "screenshot");

	}

}
