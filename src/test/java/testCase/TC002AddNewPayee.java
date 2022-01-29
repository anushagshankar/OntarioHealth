package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pagesClass.AccountSummaryPage;
import pagesClass.PayBillsPage;

public class TC002AddNewPayee extends BaseClass {
	
	
	@Test(priority=1)
	public void AddPayee() {
		test.log(LogStatus.INFO, "add Payee Test started");
		app_logs.info("add Payee test started");
		AccountSummaryPage asp=new AccountSummaryPage(driver);
		test.log(LogStatus.INFO, "Clicked PayBills button");
		asp.doClickPayBills();
		
		PayBillsPage pb=new PayBillsPage(driver);
		test.log(LogStatus.INFO, "Clicked Add new Payee button");
		pb.doClickAddPayee();
		test.log(LogStatus.INFO, "Entered information in the new Payee form");
		pb.doAddPayee("Telus", "123 45th Ave East", "123456", "cell phone");
		
		Assert.assertTrue(pb.alertContainer.isDisplayed());
		app_logs.info("add Payee test completed");
		test.log(LogStatus.INFO, "Add Payee test completed");
		
	}

}
