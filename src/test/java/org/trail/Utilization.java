 package org.trail;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Utilization extends BaseClass {
	public static void main(String[] args) throws Exception {
		Utilization a = new Utilization();
	   a.browserLaunch("https://adactinhotelapp.com/");
	WebElement txtUserName = a.Locator("id","username");
	String nm = a.excelRead(0, 0);
	a.txtsend(txtUserName,nm);
	WebElement txtpass = a.Locator("id", "password");
	String pass = a.excelRead(0, 1);
	a.txtsend(txtpass, pass);
	WebElement btnlogn = a.Locator("id", "login");
    a.click(btnlogn);
	WebElement location = a.Locator("id","location");
	a.selectByIndex(location,2);
	WebElement hotel = a.Locator("id","hotels");
	a.selectByIndex(hotel, 2);
	WebElement roomType = a.Locator("id", "room_type");
	a.selectByIndex(roomType,3 );
	WebElement noofrooms = a.Locator("id","room_nos" );
	a.selectByIndex(noofrooms, 1);
	WebElement chkindate = a.Locator("id", "datepick_in");
	a.clear(chkindate);
	a.txtsend(chkindate, "20/10/21");
	WebElement chkout = a.Locator("id","datepick_out");
	a.clear(chkout);
	a.txtsend(chkout, "21/10/21");
    WebElement adltsrm = a.Locator("id","adult_room");
    a.selectByIndex(adltsrm, 2);
    WebElement chldrm = a.Locator("id", "child_room");
    a.selectByIndex(chldrm, 2);
    WebElement clksrch = a.Locator("id", "Submit");
    a.click(clksrch);
	WebElement btnslt = a.Locator("id", "radiobutton_0");
	a.click(btnslt);
	WebElement srch = a.Locator("id","continue");
	a.click(srch);
	WebElement fname = a.Locator("id","first_name");
	String fn = a.excelRead(0, 2);
	a.txtsend(fname, fn);
	WebElement lname = a.Locator("id","last_name");
	String lstnm = a.excelRead(1, 0);
	a.txtsend(lname, lstnm);
	WebElement addrs = a.Locator("id", "address");
	String addr = a.excelRead(1, 1);
	a.txtsend(addrs, addr);
	WebElement ccno = a.Locator("id", "cc_num");
	String ccn = a.excelRead(2, 0);
    a.txtsend(ccno, ccn);
    WebElement cctype = a.Locator("id","cc_type");
    a.selectByIndex(cctype, 3);
    WebElement mnth = a.Locator("id", "cc_exp_month");
    a.selectByIndex(mnth, 5);
    WebElement yr = a.Locator("id", "cc_exp_year");
    a.selectByIndex(yr, 4);
    WebElement cvv = a.Locator("id", "cc_cvv");
    String cvn = a.excelRead(2, 1);
	a.txtsend(cvv, cvn);
	WebElement book = a.Locator("id","book_now");
	a.click(book);
	
	a.toCloseAll();
	
	
	}
	}  