package Pre_Execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClass.LibGlobal;
import X_Paths.LandingPage_Xpaths;

public class All_Executions {
	
	
	public static void mobileNumberValidation(String MobileNo) throws Exception {
		LibGlobal lib=new LibGlobal();
		LandingPage_Xpaths lp = new LandingPage_Xpaths();
		Thread.sleep(3000);
		WebElement mobileNo2 = lp.getMobileNo();
		lib.scrollDown(mobileNo2);
		mobileNo2.sendKeys(MobileNo);
		mobileNo2.sendKeys(Keys.ENTER);
		WebElement mobileNo_error = lp.getMobileNo_error();
		String text = mobileNo_error.getText();
//		System.out.println(text);
		String text1 = "Invalid Mobile Number";
		WebElement mo_error_1 = lp.getMo_error_1();
		String text2 = mo_error_1.getText();
//		System.out.println(text2);
		String text3="Invalid input (numbers only)";
		if (text.contentEquals(text1)) {

			System.out.println("Invalid Mobile Number");

		} else if(text2.contentEquals(text3)){ 

			System.out.println("Invalid Mobile Number");
		}else {
			System.out.println("Valid Mobile Number ");
		}
		
	}
}
