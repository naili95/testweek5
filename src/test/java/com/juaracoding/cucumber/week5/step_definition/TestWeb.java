package com.juaracoding.cucumber.week5.step_definition;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber.week5.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber.week5.driver.DriverSingleton;
import com.juaracoding.cucumber.week5.pages.BookFlightPage;
import com.juaracoding.cucumber.week5.pages.BookHotelPage;
import com.juaracoding.cucumber.week5.pages.LoginPage;
import com.juaracoding.cucumber.week5.utils.ConfigurationProperties;
import com.juaracoding.cucumber.week5.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class TestWeb {
	
	private WebDriver driver;
	private LoginPage loginP;
	private BookHotelPage bookHotelP;
	private BookFlightPage bookFlightP;
	
	@Autowired
	ConfigurationProperties configP;
	
	@Before
	public void initObject() {
		DriverSingleton.getInstance(configP.getBrowser());
		loginP = new LoginPage();
		bookHotelP = new BookHotelPage();
		bookFlightP = new BookFlightPage();
	}
	
	@Given("Customer akses url")
	public void customer_akses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer login salah")
	public void customer_login_salah() {
		loginP.loginSalah(configP.getEmailS(), configP.getPasswordS());
	}
	
	@Then("Customer ulang login")
	public void customer_ulang_login() {
		assertEquals(configP.getMessageWrong(), loginP.gagalLogin());
		tunggu();
		driver.navigate().refresh();
	}
	
	@Then("Customer klik login button")
	public void customer_klik_login_button() {
		loginP.submitLogin(configP.getEmail(), configP.getPassword());
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		driver.navigate().refresh();
		tunggu();
		assertEquals(configP.getTxtWelcome(), loginP.txtWelcome());
	}
	
	@When("Customer masuk url hotel")
	public void customer_masuk_url_hotel() {
		bookHotelP.subHotel();		
	}
	
	@Then("Berhasil masuk menu hotel")
	public void berhasil_masuk_menu_hotel() {
		assertEquals(configP.getTxtHotel(), bookHotelP.halHotel());
	}
	
	@Then("Customer memilih hotel")
	public void customer_memilih_hotel() {
		bookHotelP.pilihHotel();
	}
	
	@When("Customer mengisi form bayar")
	public void customer_mengisi_form_bayar() {
		bookHotelP.menuBayar(configP.getNegara(), configP.getGender(), configP.getNamaT(), configP.getNamaTT());
	}
	
	@Then("Customer mendapatkan invoice")
	public void customer_mendapatkan_invoice() {
		assertEquals(configP.getTxtBooking(), bookHotelP.halBooking());
	}
	
	@When("Customer masuk url pesawat")
	public void customer_masuk_url_pesawat() {
		bookFlightP.subFlight();	
	}
	
	@Then("Berhasil masuk menu pesawat")
	public void berhasil_masuk_menu_pesawat() {
		assertEquals(configP.getTxtFlight(), bookFlightP.halFlight());
	}
	
	@Then("Customer memilih rute")
	public void customer_memilih_rute() {
		bookFlightP.pilihFlight();
	}
	
	@When("Customer mengisi form datadiri")
	public void customer_mengisi_form_datadiri() {
		bookFlightP.menuBooking(configP.getNegara(), configP.getGender(), configP.getNamaT(), configP.getNamaTT(), configP.getBulanLahir(), configP.getHariLahir(), configP.getTahunLahir(), configP.getIdPassport(), configP.getBulanPassport(), configP.getHariPassport(), configP.getTahunPassport(), configP.getExtahunPassport());
	}
	
	@Then("Customer berhasil pesan pesawat")
	public void customer_berhasil_pesan_pesawat() {
		assertEquals(configP.getTxtBooking(), bookFlightP.invoiceFlight());
	}
	
	public void tunggu() {
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void tutupBrowser() {
		driver.quit();
	}

}
