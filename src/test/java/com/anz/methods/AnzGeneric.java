package com.anz.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AnzGeneric {
	public WebDriver driver;
	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driver) {
		return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
		}
		};
		try {
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(expectation);
		} catch (Throwable error) {
		Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
		}

}
