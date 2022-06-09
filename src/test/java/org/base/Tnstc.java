package org.base;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

public class Tnstc extends Baseclass {
	
   public static void main(String[] args) throws AWTException, InterruptedException {
	
	   browserlaunch("chrome");
	   urlLaunch("https://www.tnstc.in/home.html");
	   implicity(20);
	   maximize();
	   
Demo d=new Demo();
	   sendkeys(d.getFrom(), "chennai ");
     keyDown();   
     keyEnter();
     thread(20);
     sendkeys(d.getTo(), "salem");
     thread(20);
     keyDown();
     keyEnter();
     click(d.getDate());
     click(d.getTripdate());
     
     
}
	
}
