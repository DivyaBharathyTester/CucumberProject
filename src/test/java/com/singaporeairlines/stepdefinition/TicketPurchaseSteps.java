package com.singaporeairlines.stepdefinition;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TicketPurchaseSteps {
	
	static WebDriver driver;
	
	@Given("User launches Singapore Airlines application")
	public void user_launches_Singapore_Airlines_application() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com");
		WebElement cookies = driver.findElement(By.xpath("//div[contains(text(),'ACCEPT')]"));
		cookies.click();
		Thread.sleep(2000);
	}

	@Given("User logins using credentials")
	public void user_logins_using_credentials() throws InterruptedException {
		WebElement signIn = driver.findElement(By.xpath("(//span[contains(text(),'Sign up')])[2]"));
		signIn.click();
		Thread.sleep(2000);
	    
	}

	@When("User navigates into the page and choose ticket as per the requirement")
	public void user_navigates_into_the_page_and_choose_ticket_as_per_the_requirement() {
	    
	}

	@When("Book the flight ticket & proceed to payment option")
	public void book_the_flight_ticket_proceed_to_payment_option() {
	   
	}

	@Then("Message to be displayed as ticket has been booked")
	public void message_to_be_displayed_as_ticket_has_been_booked() {
	    
	}

	@Then("Receive confirmation regarding booking to mail address")
	public void receive_confirmation_regarding_booking_to_mail_address() {
	   
	}

}
