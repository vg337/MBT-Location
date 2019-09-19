package TestSuite;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Generic.TestManager;

public class TestSuite extends TestManager {
	
	@Test
	public void gozhgozh() {
		
		//
		ExtentTest test = extent.createTest("Test "+ testName.get(),"Test beta des modifications");
		test.log(Status.INFO, testName.get()+" Started !");
		

		test.log(Status.PASS, "Ouverture de l'apk sur le devices réussi");
		
		System.out.println("Test ok.");

		test.log(Status.INFO, "Test "+ testName.get() + " completed !");
	}

}
