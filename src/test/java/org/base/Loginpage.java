package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclass {
   
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
       
	
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement cancel;
   	
	@FindBy(name="q")
	private WebElement Search;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement click;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private WebElement iphone;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
	private WebElement addToCart;
	
	@FindBy(xpath="(//a[@class='_3hfHKJ'])[1]")
	private WebElement helppage;
	
	@FindBy(xpath="//span[text()='View More']")
	private WebElement view;

	
	
	
	
	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getHelppage() {
		return helppage;
	}

	public WebElement getView() {
		return view;
	}
	
	
	}
	

