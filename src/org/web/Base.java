package org.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Desktop\\raja\\Day11\\div\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
}
