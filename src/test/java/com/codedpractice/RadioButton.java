package com.codedpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
@Test
	public void test(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	radio.click();
	boolean check=radio.isEnabled();
	System.out.println(check);
	boolean display=radio.isDisplayed();
	System.out.println(display);

	}

}
