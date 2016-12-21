package com.gojek.assignment.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailDetails {
	private WebDriver driver;	
	
	private By txtEmailAddress=By.xpath("//input[@id='username']");
	private By txtPassword=By.xpath("//input[@id='password_1']");
	private By selectPassword=By.xpath(".//input[@id='signinLabel']");
	private By btnContinue=By.xpath("//input[@id='itineraryBtn']");
}
