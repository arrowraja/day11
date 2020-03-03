package org.web;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojo extends Base {

	
	public Pojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="shopDepartmentBtn")
	private WebElement menu;
	
	@FindBy(xpath="//a[@data-automation-id='menu-item-link-6']")
	private WebElement womens;
	
	@FindBy(xpath="(//a[@data-automation-id='sub-menu-level2'])[5]")
	private WebElement jeans;
	
	
	@FindBy(xpath="//h6[@class='_1TINY grid _2qRi-']")
	private List<WebElement> pants;

	public List<WebElement> getPants() {
		return pants;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getWomens() {
		return womens;
	}

	public WebElement getJeans() {
		return jeans;
	}
	
	
	
}
