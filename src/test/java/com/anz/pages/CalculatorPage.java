package com.anz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.anz.testexec.AnzController;

public class CalculatorPage {

	public WebDriver driver;
	
	public CalculatorPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		AnzController anzcntrlr;
	}
	
	@FindBy(xpath=".//*[@class='borrow clearfix']/div/ul/li[1]")
	private WebElement ele_application_type;
	
	public WebElement application_type_single() {
		return ele_application_type;
	}
	
	@FindBy(xpath=".//*[@class='borrow clearfix']/div/div/select")
	private WebElement ele_noofdep_dropdown;
	
	public WebElement noofdep_dropdown() {
		return ele_noofdep_dropdown;
	}
	
	@FindBy(xpath=".//*[@class='borrow clearfix']/div[3]/ul/li[1]")
	private WebElement ele_propertylike;
	
	public WebElement property_like_home() {
		return ele_propertylike;
	}
	
	@FindBy(xpath="(.//div[@class='borrow clearfix']/div/div/input)[1]")
	private WebElement ele_yourIncome;
	
	public WebElement yourincome() {
		return ele_yourIncome;
	}
	
	@FindBy(xpath="(.//div[@class='borrow clearfix']/div/div/input)[2]")
	private WebElement ele_yourotherIncome;
	
	public WebElement yourotherincome() {
		return ele_yourotherIncome;
	}
	
	@FindBy(xpath=".//input[@id='expenses']")
	private WebElement ele_livingexpenses;
	
	public WebElement livingexpenses() {
		return ele_livingexpenses;
	}
	
	@FindBy(xpath=".//input[@id='homeloans']")
	private WebElement ele_homeloans;
	
	public WebElement homeloans() {
		return ele_homeloans;
	}
	
	@FindBy(xpath=".//input[@id='otherloans']")
	private WebElement ele_otherloans;
	
	public WebElement otherloans() {
		return ele_otherloans;
	}
	
	@FindBy(xpath=".//div[@class='borrow clearfix']/div/div[@class='input__wrapper']/input[@aria-labelledby='q3q4']")
	private WebElement ele_othercommitments;
	
	public WebElement othercommitments() {
		return ele_othercommitments;
	}
	
	@FindBy(xpath=".//div[@class='borrow clearfix']/div/div[@class='input__wrapper']/input[@aria-labelledby='q3q5']")
	private WebElement ele_totalcredit;
	
	public WebElement totalcredit() {
		return ele_totalcredit;
	}
	
	@FindBy(xpath=".//button[@id='btnBorrowCalculater']")
	private WebElement ele_buttonborrow;
	
	public WebElement buttonborrow() {
		return ele_buttonborrow;
	}
	
	@FindBy(xpath=".//button[@class='start-over']")
	private WebElement ele_startover;
	
	public WebElement startover() {
		return ele_startover;
	}
	
	@FindBy(xpath=".//div[@class='borrow__error text--white clearfix']/div/span")
	private WebElement ele_error_text;
	
	public WebElement errortxt() {
		return ele_error_text;
	}
	
	@FindBy(xpath=".//*[@id='borrowResultTextAmount']")
	private WebElement ele_result;
	
	public WebElement borrowresult() {
		return ele_result;
	}
	
	
	
}
