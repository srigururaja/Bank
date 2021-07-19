package com.anz.methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.anz.pages.CalculatorPage;
import com.anz.utils.AnzClacConstants;

public class CalcPage extends CalculatorPage {
	public CalcPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	//Calling Methods from Pages for test cases.
	
		public void passing_values() throws InterruptedException {
			application_type_single().click();
			WebElement dep_dd_select = noofdep_dropdown();
			dep_dd_select.click();
			Thread.sleep(2000);
			Select dep_dd = new Select(dep_dd_select);
			dep_dd.selectByIndex(0);
			Thread.sleep(2000);
			yourincome().sendKeys("80000");
			yourotherincome().sendKeys("10000");
			livingexpenses().sendKeys("500");
			homeloans().sendKeys("0");
			otherloans().sendKeys("100");
			othercommitments().sendKeys("0");
			totalcredit().sendKeys("10000");
			property_like_home().click();
			buttonborrow().click();
			startover().sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(4000);
			String get_result = borrowresult().getText();
			System.out.println(get_result);
			if(get_result.equalsIgnoreCase("$507,000")) {
				System.out.println("The return value matched");
			}else {
				System.err.println("the value doesn't match");
			}
			
		}
		
		public void passing_values_clear() throws InterruptedException {
			application_type_single().click();
			WebElement dep_dd_select = noofdep_dropdown();
			dep_dd_select.click();
			Thread.sleep(2000);
			Select dep_dd = new Select(dep_dd_select);
			dep_dd.selectByIndex(0);
			Thread.sleep(2000);
			yourincome().sendKeys("80000");
			yourotherincome().sendKeys("10000");
			livingexpenses().sendKeys("500");
			homeloans().sendKeys("0");
			otherloans().sendKeys("100");
			othercommitments().sendKeys("0");
			totalcredit().sendKeys("10000");
			property_like_home().click();
			buttonborrow().click();
			startover().sendKeys(Keys.PAGE_DOWN);
			startover().click();
			Thread.sleep(10000);	
		}
		
		public void entry_one_value() throws InterruptedException {
			livingexpenses().sendKeys("1");
			otherloans().sendKeys(Keys.PAGE_DOWN);
			buttonborrow().sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(2000);
			buttonborrow().click();
			String text_error = errortxt().getText();
			System.out.println(text_error);
			if(text_error.contains(AnzClacConstants.error_msg)) {
				System.out.println("the Content was matched. Plz enter all the details.");
			}else {
				System.err.println("The content might be change, discuss with Developers");
			}
			
		}
}
