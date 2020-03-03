package org.web;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jcpenny extends Base {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Desktop\\raja\\Day11\\div\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.jcpenney.com/?utm_source=google&utm_medium=cpc&utm_campaign=paid%20search&cid=paid%20search%7cgoogle%7cG_Desktop_Brand_JCP_Official_Site_INT_ENG%7cG_Desktop_Brand_JCP_Official_Site_INT_ENG_Exact_JCPenney&utm_content=kwd-29180950&utm_adgroupid=9016270245&utm_keyword=jcpenny&utm_matchtype=e&utm_device=c&&s_kwcid=AL!6728!3!261041673100!e!!g!!jcpenny&gclid=Cj0KCQiAqNPyBRCjARIsAKA-WFyz2DTfLx5wBICoEd4xG5DPB8_ndHxe9xQDbzXKY-KKsbN8No_CvKoaAl7FEALw_wcB&gclsrc=aw.ds");
		Pojo p=new Pojo();
		Actions a=new Actions(driver);
		a.moveToElement(p.getMenu()).perform();
		a.moveToElement(p.getWomens()).perform();
		p.getJeans().click();
		
		List<WebElement> pants = p.getPants();
	
		
		
		 for (WebElement pants1 : pants) {
			String text = pants1.getText();
			
			if(text.equals("Levi’s® 505™ Straight Jeans")) {
				pants1.click();
				}
		}
		 
		
		 
		 
	}

}
