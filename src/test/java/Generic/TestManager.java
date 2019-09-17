package Generic;

import java.lang.reflect.Method;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestManager {

	AppiumDriver<MobileElement> driver;
	private ThreadLocal<String> testName = new ThreadLocal<>();

	@BeforeSuite
	public void setup() {

		System.out.println("===============================================");
		System.out.println("------------------Test start!------------------");
		System.out.println("===============================================");
		System.out.println("Ouverture de l'APK.");
		
		// Mise en place des paramètres nécessaire au lancement de l'app sous Appium.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		// TO DO : Changer le UDID en fonction de votre appareil.
		capabilities.setCapability("udid", "CLCDU18613003856");
		// TO DO : Changer le numéro de version android en fonction de votre appareil.
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability("appPackage", "com.sogeti.inblue.findrive");
		capabilities.setCapability("appActivity", "com.sogeti.inblue.findrive.MainActivity");
		capabilities.setCapability("noReset", "true");

		try {

			// Ouverture de l'APK
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		}

		catch (Exception exp) {
			System.out.println("Cause is :" + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void beforeMethod(Method method){
	   testName.set(method.getName());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Le test " + testName.get() + " est terminé." );
	}

	@AfterSuite
	public void teardown() {

		driver.quit();
		System.out.println("===============================================");
		System.out.println("-----------------Test finish !-----------------");
		System.out.println("===============================================");

	}

}
