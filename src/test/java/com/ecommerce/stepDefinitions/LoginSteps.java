package com.ecommerce.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;

	@Given("the user launches the browser")
	public void the_user_launches_the_browser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("navigates to {string}")
	public void navigates_to(String string) {
		driver.get("http://automationexercise.com");

	}

	@Then("the home page should be visible successfully")
	public void the_home_page_should_be_visible_successfully() {
		assert driver.findElement(By.cssSelector("home-page-selector")).isDisplayed();
	}

	@When("the user clicks on Signup Login button")
	public void the_user_clicks_on_signup_login_button() {
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();

	}

	@Then("Login to your account should be visible")
	public void login_to_your_account_should_be_visible(String text) {
		assert driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).isDisplayed();

	}

	@When("the user enters correct email address and password")
	public void the_user_enters_correct_email_address_and_password() {
		driver.findElement(By.name("email")).sendKeys("raza@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Masum@123");

	}

	@When("clicks the login button")
	public void clicks_the_login_button(String button) {
		driver.findElement(By.name(button)).click();

	}

	@Then("Logged in as username should be visible")
	public void logged_in_as_username_should_be_visible(String text) {
		assert driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).isDisplayed();

	}

	@When("the user clicks Delete Account button")
	public void the_user_clicks_delete_account_button() {

	}

	@Then("ACCOUNT DELETED! should be visible")
	public void account_deleted_should_be_visible() {

	}

}
