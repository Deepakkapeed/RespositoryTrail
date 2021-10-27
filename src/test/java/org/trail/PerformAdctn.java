package org.trail;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class PerformAdctn extends CmpltBase{
	public static void main(String[] args) throws IOException {
		getDriver("https://adactinhotelapp.com/");
		AdactinLogin a= new AdactinLogin();
		WebElement username = a.getUsername();
		String excel1 = excelRead(0, 0);
		sendkeys(username, excel1);
		
		
		String excel2 = excelRead(0, 1);
		WebElement pass = a.getPassword();
        sendkeys(pass, excel2);
       
        
        WebElement login = a.getLogin();
        click(login);
       
        
        AdactinpreferencePage b = new AdactinpreferencePage();
        WebElement location = b.getLocation();
        selectByIndex(location, 2);
        
        WebElement submit = b.getSubmit();
        click(submit);
        
        SelectionPage c = new SelectionPage();
        WebElement radiobutton_0 = c.getRadiobutton_1();
        click(radiobutton_0);
      WebElement clckcontinue = c.getClckcontinue();
      click(clckcontinue);
        }
	

}
