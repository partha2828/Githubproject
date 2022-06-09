package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo extends Baseclass {

	public Demo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="matchStartPlace")
	private WebElement From;
	
	@FindBy(id="matchEndPlace")
	private WebElement To;
	
	@FindBy(id="txtdeptDateRtrip")
	private WebElement date;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[3]")
	private WebElement tripdate;
	
	@FindBy(id="selectOnwardTimeSlab")
	private WebElement time;
	
	@FindBy(id="txtAdultMales")
	private WebElement Adult;
	
	@FindBy(id="txtAdultFemales")
	private WebElement  Female;
	
	@FindBy(id="txtChildMales")
	private WebElement child;
	
	@FindBy(id="txtChildFemales")
	private WebElement childFemale;
	
	@FindBy(id="selectClass")
private WebElement service;
	
	@FindBy(xpath="(//a[@class='dboxheader'])[1]")
	private WebElement search;

	public WebElement getFrom() {
		return From;
	}

	public WebElement getTo() {
		return To;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getTripdate() {
		return tripdate;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getFemale() {
		return Female;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getChildFemale() {
		return childFemale;
	}

	public WebElement getService() {
		return service;
	}

	public WebElement getSearch() {
		return search;
	}
}
