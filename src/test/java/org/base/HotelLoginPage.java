package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelLoginPage extends Baseclass {
	
public HotelLoginPage() {
	
	PageFactory.initElements(driver, this);
	
}	
  @FindBy(name="username")
   private WebElement Username;

    @FindBy(name="password")
    private WebElement Password;
    
    @FindBy(name="login")
    private WebElement Login;
    
    @FindBy(name="location")
    private WebElement location;
    
    @FindBy(name="hotels")
    private WebElement Hotels;
   
    @FindBy(name="room_type")
    private WebElement Roomtype;
    
    @FindBy(name="room_nos")
    private WebElement RoomNos;
    
    @FindBy(name="datepick_in")
    private WebElement Checkin;
    
    @FindBy(name="datepick_out")
    private WebElement Checkout; 
    
    @FindBy(name="adult_room")
    private WebElement Adultperroom;
    
    @FindBy(name="child_room")
    private WebElement Childperroom;           
    
    @FindBy(name="Submit")
    private WebElement Search;
    
    @FindBy(name="radiobutton_0")
    private WebElement Booking;
    
    @FindBy(name="continue")
    private WebElement Continue;
    
    @FindBy(name="first_name")
    private WebElement FirstName;
    
    @FindBy(name="last_name")
    private WebElement LastName;
    
    @FindBy(name="address")
    private WebElement BillingAddress;
    
    @FindBy(name="cc_num")
    private WebElement CreditCardNO;
    
    @FindBy(name="cc_type")
    private WebElement CreditCardType;
    
    @FindBy(name="cc_exp_month")
    private WebElement CardExpiryMonth;
    
    @FindBy(name="cc_exp_year")
    private WebElement CardExpiryYear;
    
    @FindBy(name="cc_cvv")
    private WebElement CVV;
    
    @FindBy(name="book_now")
    private WebElement BookNow;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultperroom() {
		return Adultperroom;
	}

	public WebElement getChildperroom() {
		return Childperroom;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getBooking() {
		return Booking;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNO() {
		return CreditCardNO;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getCardExpiryMonth() {
		return CardExpiryMonth;
	}

	public WebElement getCardExpiryYear() {
		return CardExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
    
    
    
    @FindBy(name="order_no")
    private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}
    
    
}
