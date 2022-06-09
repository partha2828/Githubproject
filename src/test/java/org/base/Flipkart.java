package org.base;

public class Flipkart extends Baseclass {
	public static void main(String[] args) throws InterruptedException {


		browserlaunch("chrome");
		implicity(20);

		urlLaunch("https://www.flipkart.com/");
		Loginpage l = new Loginpage();

		click(l.getCancel());
		sendkeys(l.getSearch(), "iphone");
		click(l.getClick());
		click(l.getIphone());
		getwindows(1);
		click(l.getAddToCart());
		click(l.getHelppage());
		getwindows(2);
		click(l.getView());

	}

}
