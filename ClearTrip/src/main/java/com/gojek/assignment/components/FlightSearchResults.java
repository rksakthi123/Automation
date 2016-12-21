package com.gojek.assignment.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSearchResults {
	
	private WebDriver driver;	
	
	private By btnBook=By.xpath("//div/button[contains(@class,'booking fRight') and (@type='submit')]");
}
