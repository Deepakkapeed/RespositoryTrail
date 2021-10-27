package org.trail;

import org.openqa.selenium.WebElement;

public class FacebkLogin extends CmpltBase{
  public static void main(String[] args) {
	  
	  getDriver("https://en-gb.facebook.com/login/");
      maximize();
      implicityWait(1000);
	 POJO a = new POJO();
	  WebElement username = a.getUsername();
	  sendkeys(username, "qwerty");
	 
	  String getattribute = a.getattribute(username,"id");
	  System.out.println(getattribute);
	  WebElement password = a.getPassword();
	  sendkeys(password, "asdfgh5");
	  WebElement login = a.getLogin();
	  click(login);
	  
	
}
  
}
 