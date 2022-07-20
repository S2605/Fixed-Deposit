package com.definition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

	public static void loadProperties() {

		FileReader reader = null;

		try {
			reader = new FileReader(
					"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\com.cucu.org\\src\\test\\resources\\com\\read.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		Properties prop = new Properties();

		try {
			prop.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Constants.APP_URL = prop.getProperty("APP_URL");
		Constants.BROWSER = prop.getProperty("BROWSER");
		Constants.UrlChecking = prop.getProperty("UrlChecking");

	}

}
