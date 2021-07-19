package com.anz.testexec;

import org.testng.annotations.Test;



public class AnzTestCases extends AnzController {
	
	@Test(description = "Filling all the details in Loan Page", groups = {"AnzHomeLoanCalc" }, priority = 1)
	public void TestCas_1() throws InterruptedException {
		calcpagemed.passing_values();
	}
	
	@Test(description = "Clearing all the details in Loan Page", groups = {"AnzHomeLoanCalc" }, priority = 2)
	public void TestCas_2() throws InterruptedException {
		calcpagemed.passing_values_clear();
	}
	
	@Test(description = "Text Handling in Loan Page", groups = {"AnzHomeLoanCalc" }, priority = 3)
	public void TestCas_3() throws InterruptedException {
		calcpagemed.entry_one_value();
	}
}
