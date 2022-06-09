package org.base;

import org.openqa.selenium.Keys;

public class sample extends Baseclass {

	public static void main(String[] args) {
		 
 browserlaunch("chrome");
 urlLaunch("https://www.flipkart.com/");
 Loginpage l=new Loginpage();
 sendkeys(l.getSearch(), "partha");
click(l.getClick());
 
	
	}
}
