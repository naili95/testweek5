package com.juaracoding.cucumber.week5.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${emailS}")
	private String emailS;
	
	@Value("${passwordS}")
	private String passwordS;
	
	@Value("${messageWrong}")
	private String messageWrong;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${txtHotel}")
	private String txtHotel;
	
	@Value("${negara}")
	private String negara;

	@Value("${gender}")
	private String gender;
	
	@Value("${namaT}")
	private String namaT;
	
	@Value("${namaTT}")
	private String namaTT;
	
	@Value("${txtBooking}")
	private String txtBooking;
	
	@Value("${txtFlight}")
	private String txtFlight;
	
	@Value("${bulanLahir}")
	private String bulanLahir;
	
	@Value("${hariLahir}")
	private String hariLahir;
	
	@Value("${tahunLahir}")
	private String tahunLahir;
	
	@Value("${idPassport}")
	private String idPassport;
	
	@Value("${bulanPassport}")
	private String bulanPassport;
	
	@Value("${hariPassport}")
	private String hariPassport;
	
	@Value("${tahunPassport}")
	private String tahunPassport;
	
	@Value("${exTahunPassport}")
	private String extahunPassport;
	
	public String getBrowser() {
		return browser;
	}
	
	public String getEmailS() {
		return emailS;
	}
	
	public String getMessageWrong() {
		return messageWrong;
	}
	
	public String getPasswordS() {
		return passwordS;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getTxtWelcome() {
		return txtWelcome;
	}
	
	public String getTxtHotel() {
		return txtHotel;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getNegara() {
		return negara;
	}
	
	public String getNamaT() {
		return namaT;
	}
	
	public String getNamaTT() {
		return namaTT;
	}
	
	public String getTxtBooking() {
		return txtBooking;
	}
	
	public String getTxtFlight() {
		return txtFlight;
	}
	
	public String getBulanLahir() {
		return bulanLahir;
	}
	
	public String getHariLahir() {
		return hariLahir;
	}
	
	public String getTahunLahir() {
		return tahunLahir;
	}
	
	public String getIdPassport() {
		return idPassport;
	}
	
	public String getBulanPassport() {
		return bulanPassport;
	}
	
	public String getHariPassport() {
		return hariPassport;
	}
	
	public String getTahunPassport() {
		return tahunPassport;
	}
	
	public String getExtahunPassport() {
		return extahunPassport;
	}

}
