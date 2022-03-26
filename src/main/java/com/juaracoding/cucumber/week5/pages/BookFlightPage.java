package com.juaracoding.cucumber.week5.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.week5.driver.DriverSingleton;

public class BookFlightPage {
private WebDriver driver;
	
	public BookFlightPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#fadein > header > div.header-menu-wrapper.padding-right-100px.padding-left-100px > div > div > div > div > div.main-menu-content > nav > ul > li:nth-child(3) > a")
	WebElement btnFlight;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/section/div/h2")
	WebElement txtFlight;
	
	@FindBy(xpath = "//*[@id=\"new-york\"]/div/div[2]/a/div/div")
	WebElement pilihFlight;
	
	@FindBy(xpath = "//*[@id=\"data\"]/ul/li[2]/div/form/div/div[2]/div/button")
	WebElement pilihJam;
	
	@FindBy(name ="nationality")
	WebElement nationality2;
	
	@FindBy(name="title_1")
	WebElement gender;
	
	@FindBy(name="firstname_1")
	WebElement namaT;
	
	@FindBy(name="lastname_1")
	WebElement namaTT;
	
	@FindBy(name="nationality_1")
	WebElement nationality3;
	
	@FindBy(name="dob_month_1")
	WebElement bulanLahir;

	@FindBy(name="dob_day_1")
	WebElement hariLahir;

	@FindBy(name="dob_year_1")
	WebElement tahunLahir;

	@FindBy(name="passport_1")
	WebElement idPassport;

	@FindBy(name="passport_issuance_month_1")
	WebElement bulanPassport;

	@FindBy(name="passport_issuance_day_1")
	WebElement hariPassport;

	@FindBy(name="passport_issuance_year_1")
	WebElement tahunPassport;

	@FindBy(name="passport_month_1")
	WebElement exBulanPassport;

	@FindBy(name="passport_day_1")
	WebElement exHariPassport;

	@FindBy(name="passport_year_1")
	WebElement exTahunPassport;

	@FindBy(id="gateway_paypal")
	WebElement payPal;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[4]/div/div/div/label")
	WebElement btnAgree;
	
	@FindBy(id="booking")
	WebElement btnBooking;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/section/div/div/div/div/div[2]/div[1]/h3")
	WebElement txtInvoiceFlight;
	
	public void subFlight() {
		btnFlight.click();
	}
	
	public String halFlight() {
		return txtFlight.getText();
	}
	
	public void pilihFlight() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		pilihFlight.click();
		pilihJam.click();
	}
	
	public void menuBooking(String negara, String jk, String guest, String guest1, String bL, String hL, String tL, String idPass, String bP, String hP, String tP, String tE) {
		nationality2.click();
		nationality2.sendKeys(negara);
		nationality2.sendKeys(Keys.ENTER);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		gender.click();
		gender.sendKeys(jk);
		gender.sendKeys(Keys.ENTER);
		namaT.sendKeys(guest);
		namaTT.sendKeys(guest1);
		nationality3.click();
		nationality3.sendKeys(negara);
		nationality3.sendKeys(Keys.ENTER);
		bulanLahir.click();
		bulanLahir.sendKeys(bL);
		bulanLahir.sendKeys(Keys.ENTER);
		hariLahir.click();
		hariLahir.sendKeys(hL);
		hariLahir.sendKeys(Keys.ENTER);
		tahunLahir.click();
		tahunLahir.sendKeys(tL);
		tahunLahir.sendKeys(Keys.ENTER);
		je.executeScript("window.scrollBy(0,100)");
		idPassport.sendKeys(idPass);
		bulanPassport.click();
		bulanPassport.sendKeys(bP);
		bulanPassport.sendKeys(Keys.ENTER);
		hariPassport.click();
		hariPassport.sendKeys(hP);
		hariPassport.sendKeys(Keys.ENTER);
		tahunPassport.click();
		tahunPassport.sendKeys(tP);
		tahunPassport.sendKeys(Keys.ENTER);
		exBulanPassport.click();
		exBulanPassport.sendKeys(bP);
		exBulanPassport.sendKeys(Keys.ENTER);
		exHariPassport.click();
		exHariPassport.sendKeys(hP);
		exHariPassport.sendKeys(Keys.ENTER);
		exTahunPassport.click();
		exTahunPassport.sendKeys(tE);
		exTahunPassport.sendKeys(Keys.ENTER);
		je.executeScript("window.scrollBy(0,100)");
		payPal.click();
		je.executeScript("window.scrollBy(0,500)");
		btnAgree.click();
		btnBooking.click();
	}
	
	public String invoiceFlight() {
		return txtInvoiceFlight.getText();
	}


}
