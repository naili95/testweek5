package com.juaracoding.cucumber.week5.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.week5.driver.DriverSingleton;

public class BookHotelPage {
	
private WebDriver driver;
	
	public BookHotelPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#fadein > header > div.header-menu-wrapper.padding-right-100px.padding-left-100px > div > div > div > div > div.main-menu-content > nav > ul > li:nth-child(2) > a")
	WebElement btnHotel;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/section/div/h2")
	WebElement txtHotel;
	
	@FindBy(css = "#fadein > section.hotel-area.section-bg.section-padding.overflow-hidden.padding-right-100px.padding-left-100px > div > div.row.padding-top-50px > div > div > div > div.owl-nav > div.owl-next")
	WebElement clickNext;
	
	@FindBy(css = "#fadein > section.hotel-area.section-bg.section-padding.overflow-hidden.padding-right-100px.padding-left-100px > div > div.row.padding-top-50px > div > div > div > div.owl-nav > div.owl-prev")
	WebElement clickPrev;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/section[2]/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/h3/a")
	WebElement pilihHotel;
	
	@FindBy(css = "#availability > div.single-content-item.padding-top-40px.padding-bottom-30px.rooms > div:nth-child(2) > div.card-body > div > div.col-md-9 > form > div > div.col-md-3.booked_42 > div > div > button")
	WebElement pilihRoom;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div[6]/div[2]/select")
	WebElement nationality;
	
	@FindBy(name="title_1")
	WebElement gender;
	
	@FindBy(name="firstname_1")
	WebElement namaT;
	
	@FindBy(name="lastname_1")
	WebElement namaTT;
	
	@FindBy(id="gateway_paypal")
	WebElement payPal;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[4]/div/div/div/label")
	WebElement btnAgree;
	
	@FindBy(id="booking")
	WebElement btnBooking;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div/div/div/div[2]/div[1]/h3")
	WebElement txtBooking;
	
	public void subHotel() {
		btnHotel.click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		clickNext.click();
		clickPrev.click();
	}
	
	public String halHotel() {
		return txtHotel.getText();
	}
	
	public void pilihHotel() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		pilihHotel.click();
		je.executeScript("window.scrollBy(0,1200)");
		pilihRoom.click();
	}
	
	public void menuBayar(String negara, String jk, String guest, String guest1) {
		nationality.click();
		nationality.sendKeys(negara);
		nationality.sendKeys(Keys.ENTER);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		gender.click();
		gender.sendKeys(jk);
		gender.sendKeys(Keys.ENTER);
		namaT.sendKeys(guest);
		namaTT.sendKeys(guest1);
		je.executeScript("window.scrollBy(0,500)");
		payPal.click();
		je.executeScript("window.scrollBy(0,500)");
		btnAgree.click();
		btnBooking.click();
	}
	
	public String halBooking() {
		return txtBooking.getText();
	}

}
