package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Desktop\\raja\\Day11\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (WebElement eachrow : allrow) {
			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (WebElement eachdata : alldata) {
				String text = eachdata.getText();
				System.out.println(text);
				
			}}*/
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (int i=0;i<allrow.size();i++) {
			WebElement eachrow = allrow.get(i);
			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (int j=0;j<alldata.size();j++) {
				WebElement eachdata = alldata.get(j);
				String text = eachdata.getText();
				if(text.equals("China")) {
					WebElement webElement = allrow.get(i);
					System.out.println(webElement .getText());
				}
				
			}} 
		
	/*	driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (int i=allrow.size()-2;i<allrow.size();i++) {
			WebElement eachrow = allrow.get(i);
		List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (int j=0;j<alldata.size();j++)  {
				WebElement eachdata = alldata.get(j);
				String text = eachdata.getText();
				System.out.println(text);*/
		
		/*driver.get("http://toolsqa.com/automation-practice-table/");
		String text = driver.findElement(By.xpath("//table[@class='tsc_table_s13']")).getText();
		System.out.println();*/
		
		
		/*driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (int i=2;i<=3;i++) {
			WebElement eachrow = allrow.get(i);
		List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (int j=0;j<alldata.size();j++)  {
				WebElement eachdata = alldata.get(j);
				String text = eachdata.getText();
				System.out.println(text);
		
			}}*/
		
		//driver.get("http://leafground.com/pages/table.html");
		
			/*List<WebElement> z = driver.findElements(By.tagName("th"));
			int k = z.size();
			System.out.println(k);*/
		
		/*List<WebElement> x = driver.findElements(By.tagName("tr"));
		System.out.println(x.size());*/
		/*List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (WebElement eachrow : allrow) {
			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (WebElement eachdata : alldata) {
				String text = eachdata.getText();
				if(text.contains("with Elements")) {
					WebElement c = alldata.get(2);
					System.out.println(c.getText());
				}
				
			}
			
		}*/
		
		/*driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (WebElement eachrow : allrow) {
			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (WebElement eachdata : alldata) {
				String text = eachdata.getText();
				
				if(text.contains("Jun 2020")) {
					
					}
				}}*/
			}
		
	}


