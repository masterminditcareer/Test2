package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingninPage {
   WebDriver driver;
   
   public SingninPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
   public WebElement signin;
   public void getSignin() {
	   signin.click();
   }
   
   @FindBy(xpath="//input[@id='ap_email']")
   public WebElement email;
   public void getEmail() {
	   email.sendKeys("ummul");
   }
   @FindBy(xpath="//input[@id='continue']")
   public WebElement click;
   public void getclick() {
	   click.click();
   }
   @FindBy(xpath="//input[@id='ap_password']")
   public WebElement password;
   public void getpassword() {
	   password.sendKeys("farsf2");
   }
   
   @FindBy(xpath="//input[@id='signInSubmit']")
   public WebElement clickTwo;
   public void clicktwo() {
	   clickTwo.click();
   }
}
