package org.trail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage extends CmpltBase {
	public SelectionPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_1")
	private WebElement radiobutton_1;
	@FindBy(id="continue")
	private WebElement clckcontinue ;
	public WebElement getRadiobutton_1() {
		return radiobutton_1;
	}
	public WebElement getClckcontinue() {
		return clckcontinue;
	}
	

}
