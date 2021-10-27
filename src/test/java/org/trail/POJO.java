package org.trail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO extends CmpltBase {
	
	public POJO() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}	
	@FindBy(id="email")	
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="loginbutton")
	private WebElement login;
	
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
