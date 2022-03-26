package com.juaracoding.cucumber.week5.driver;

import com.juaracoding.cucumber.week5.utils.Constants;

public class DriverStrategyImplementator {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
		case Constants.FIREFOX:
			return new Firefox();
		default:
			return null;
		}
	}

}
