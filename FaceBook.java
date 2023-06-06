package org.stepdefinition;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook extends BaseClass
{
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() 
	{
		launchTheBrowser();
		windowMax();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() 
	{
		launchUrl("https://en-gb.facebook.com/");
		
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() 
	{
	    driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	}

	@When("To pass firstname in first text box")
	public void to_pass_firstname_in_first_text_box(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Kannan");
		//System.out.println(firstname);
	    	
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() 
	{
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Dhevaki");
		//System.out.println(lastname);
	    	
	    
	}

	@When("To pass mobileno or email in secondname text box")
	public void to_pass_mobileno_or_email_in_secondname_text_box(io.cucumber.datatable.DataTable dataTable) 
	{
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("kannanvenkat589@gmail.com");
		//System.out.println(mobile);
		
	    }

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() 
	{
	    driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Pass@word1");
	    //System.out.println(pass);
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() 
	{
		
	    
	}

}
