package com.juaracoding.cucumber.week5.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.week5.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement inEmail;
	
	@FindBy(name = "password")
	WebElement inPass;
	
	@FindBy(css = "#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")
	WebElement btnLogin;
	
	@FindBy(id="cookie_stop")
	WebElement cookieStop;
	
	@FindBy(css ="#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > div")
	WebElement messageWrong;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[1]/div/div[2]/div/div[2]/span")
	WebElement txtWelcome;
	
	public void loginSalah(String emailS, String passwordS) {
		cookieStop.click();
		inEmail.sendKeys(emailS);
		inPass.sendKeys(passwordS);
		btnLogin.click();
	}
	
	public String gagalLogin() {
		return messageWrong.getText();
	}
	
	public void submitLogin(String email, String password) {
		inEmail.sendKeys(email);
		inPass.sendKeys(password);
		btnLogin.click();
	}
	
	public String txtWelcome() {
		return txtWelcome.getText();
	}

}
