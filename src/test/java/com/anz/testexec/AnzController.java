package com.anz.testexec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.anz.methods.AnzGeneric;
import com.anz.methods.CalcPage;
import com.anz.pages.CalculatorPage;

public class AnzController {
	public static WebDriver driver;
	public static String sDirpath = System.getProperty("user.dir");

	// Create an object for Pages
	protected CalculatorPage calc_page;
	protected AnzGeneric anzgen;
	protected CalcPage calcpagemed;

	@BeforeMethod(alwaysRun = true)
	public void Setup() {
		// Setup
		System.setProperty("webdriver.chrome.driver",
				"/home/sthiyagaraj/eclipse-workspace/Bank/resources/chromedriver91");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		objCreate();
	}

	@AfterMethod(alwaysRun = true)
	public void EndSetup() {
		driver.quit();
		System.out.println("Browser closed");
		driver = null;
	}

	private void objCreate() {
		calc_page = new CalculatorPage(driver);
		anzgen = new AnzGeneric();
		calcpagemed = new CalcPage(driver);
		
	}

}
