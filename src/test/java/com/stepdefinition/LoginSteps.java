package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SingninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Base{
	SingninPage sp;
	
	@Given("^user on home page$")
	public void user_on_home_page() throws Throwable {
		getBrowser();
		sp=PageFactory.initElements(driver, SingninPage.class);
	}

	@When("^user click signin button$")
	public void user_click_signin_button() throws Throwable {
		sp.getSignin();
		
	    // Write code here that turns the phrase above into concrete actions
	  //driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	}

	@When("^user enter email$")
	public void user_enter_email() throws Throwable {
		sp.getEmail();
//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Ummul Mukta");

	}

	@When("^user click continue button$")
	public void user_click_continue_button() throws Throwable {
		sp.getclick();
//driver.findElement(By.xpath("//input[@id='continue']")).click();
//driver.findElement(By.id("continue")).click();
		//driver.findElement(By.linkText("Continue")).click();
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	 //  driver.findElement(By.xpath("")).sendKeys("fdcvjm,");
	   //driver.quit();
	  
		sp.getpassword();
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	    sp.clicktwo();
	}

	@Then("^sucecessful login$")
	public void sucecessful_login() throws Throwable {
		String s=driver.getTitle()
		System.out.println(driver.getTitle());
	   Assert.assertEquals(driver.getTitle(), "Amaz Sign-In");
	  
	}


}
