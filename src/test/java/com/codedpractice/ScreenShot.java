package com.codedpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static void screen(WebDriver driver,String s) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(s+".png"));
		
		
		
		
		
	}
	
	
}
