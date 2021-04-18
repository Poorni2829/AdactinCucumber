package org.adac;


import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Base {

	public BookHotel() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;

	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditcrdno;

	@FindBy(id="cc_type")
	private WebElement creditcrdtype;

	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	
	@FindBy(id="cc_type")
	private WebElement cc_type;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditcrdno() {
		return creditcrdno;
	}

	public WebElement getCreditcrdtype() {
		return creditcrdtype;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	 
}
