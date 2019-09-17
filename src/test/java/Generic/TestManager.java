package Outils;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestManager {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		
		System.out.println("Ouverture de l'APK.");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//TO DO : Changer le UDID en fonction de votre appareil.
		capabilities.setCapability("udid", "CLCDU18613003856");
		//TO DO : Changer le numéro de version android en fonction de votre appareil.
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

	@AfterTest

	public void teardown() {

		driver.quit();

	}

}
