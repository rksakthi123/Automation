package com.gojek.assignment.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Itinerary {
	private WebDriver driver;	
	
	private By checkTermsAndConditions=By.xpath("//input[@id='insurance_confirm']");
	private By btnContinueBooking=By.xpath("//input[@id='itineraryBtn']");
}
