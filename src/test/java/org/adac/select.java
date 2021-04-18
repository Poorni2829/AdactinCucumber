package org.adac;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select  extends Base {

public select() {
	
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//input[@type='radio']")
private WebElement radioBtn;

@FindBy(id="continue")
private WebElement continueBtn;

public WebElement getRadioBtn() {
	return radioBtn;
}

public WebElement getContinueBtn() {
	return continueBtn;
}

}



