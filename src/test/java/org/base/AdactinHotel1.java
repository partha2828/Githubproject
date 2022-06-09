package org.base;

import java.io.IOException;

public class AdactinHotel1 extends Baseclass{
	
	public static void main(String[] args) throws IOException {
		
		
		browserlaunch("chrome");
		urlLaunch("http://adactinhotelapp.com/");
		implicity(20);
		
		HotelLoginPage hl=new HotelLoginPage();
		sendkeys(hl.getUsername(), readexcel("Adactin Hotel", "sheet1", 1,0 ));
		sendkeys(hl.getPassword(), readexcel("Adactin Hotel", "sheet1",1 , 1));
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
		sendkeys(hl.getFirstName(), readexcel("Adactin Hotel", "sheet1", 1,2));
		sendkeys(hl.getLastName(), readexcel("Adactin Hotel", "sheet1",1 , 3));
		sendkeys(hl.getBillingAddress(), readexcel("Adactin Hotel", "sheet1", 1, 4));
		sendkeys(hl.getCreditCardNO(),readexcel("Adactin Hotel", "sheet1", 1, 5));
		Selectbyindex(hl.getCreditCardType(), 1);
		SelectbyValue(hl.getCardExpiryMonth(), "10");
		SelectbyVisibleText(hl.getCardExpiryYear(), "2022");
		sendkeys(hl.getCVV(), readexcel("Adactin Hotel", "sheet1", 1, 6));
		click(hl.getBookNow());
		String attribute = getAttribute(hl.getOrderno(),"value");
		System.out.println(attribute);

	}

}
