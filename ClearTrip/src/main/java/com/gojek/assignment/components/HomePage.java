package com.gojek.assignment.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;	
	private By txtFrom=By.xpath("//input[@id='FromTag']");
	private By txtTo=By.xpath("//input[@id='ToTag']");
	
	//DatePicker.//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a
	private By selectAdults=By.xpath("//input[@id='Adults']");
	private By selectChildrens=By.xpath("//input[@id='Childrens']");
	private By selectInfants=By.xpath("//input[@id='Infants']");
	
	private By btnSearchFlights=By.xpath("//input[@id='SearchBtn']");
	
	private By radioRoundTrip=By.xpath("//input[@id='RoundTrip']");
}
