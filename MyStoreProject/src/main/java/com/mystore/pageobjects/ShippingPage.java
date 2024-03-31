/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.MyAction;
import com.mystore.base.BaseClass;

/**
 * @author Hitendra
 *
 */
public class ShippingPage extends BaseClass {
	
	MyAction action= new MyAction();
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	public ShippingPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void checkTheTerms() throws Throwable {
		action.click(getDriver(), terms);
	}
	
	public PaymentPage clickOnProceedToCheckOut() throws Throwable {
		action.click(getDriver(), proceedToCheckOutBtn);
		return new PaymentPage();
	}

}
