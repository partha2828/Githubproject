package org.base;

public class AdactinHotel extends Baseclass {

	public static void main(String[] args) {
		
		browserlaunch("chrome");
		urlLaunch("http://adactinhotelapp.com/");
		implicity(20);
		
		HotelLoginPage hl=new HotelLoginPage();
		sendkeys(hl.getUsername(), "parthaaaa");
		sendkeys(hl.getPassword(), "9790048935");
		click(hl.getLogin());
		Selectbyindex(hl.getLocation(), 5);
		SelectbyValue(hl.getHotels(), "Hotel Sunshine");
		SelectbyVisibleText(hl.getRoomtype(), "Deluxe");
		Selectbyindex(hl.getRoomNos(), 2);
		sendkeys(hl.getCheckin(), "29/05/2022");
		sendkeys(hl.getCheckout(), "01/06/2022");
		SelectbyValue(hl.getAdultperroom(), "3");
		SelectbyValue(hl.getChildperroom(),"1");
		click(hl.getSearch());
		click(hl.getBooking());
		click(hl.getContinue());
		sendkeys(hl.getFirstName(), "partha");
		sendkeys(hl.getLastName(), "Sarathi");
		sendkeys(hl.getBillingAddress(), "567 Timesquare Highway 60547");
		sendkeys(hl.getCreditCardNO(), "7894561230123654");
		Selectbyindex(hl.getCreditCardType(), 1);
		SelectbyValue(hl.getCardExpiryMonth(), "10");
		SelectbyVisibleText(hl.getCardExpiryYear(), "2022");
		sendkeys(hl.getCVV(), "280");
		click(hl.getBookNow());
		String attribute = getAttribute(hl.getOrderno(),"value");
		System.out.println(attribute);
			}
	
	
}
