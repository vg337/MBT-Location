package Generic;

import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Outils.AppliManager;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestManager extends AppliManager {

	//Variable
	protected static ThreadLocal<String> testName = new ThreadLocal<>();
	protected static ExtentHtmlReporter htmlreporter;
	protected static ExtentReports extent;
	protected static DesiredCapabilities capabilities;
	
	@BeforeSuite
	public void setup() {
		
		/**
		 * ExtendReporter Setup
		 */
		htmlreporter = new ExtentHtmlReporter("test-output/ExtendReporter/extent.html");
		
		// Création d'un Object ExtendReports et lien avec un reporter(s) 
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		/**
		 * ApkDriver Setup
		 */
		
		System.out.println("===============================================");
		System.out.println("------------------Test start!------------------");
		System.out.println("===============================================");
		System.out.println("Ouverture de l'APK.");

		// Mise en place des paramètres nécessaire au lancement de l'app sous Appium.
		capabilities = new DesiredCapabilities();
				
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		// TO DO : Changer le UDID en fonction de votre appareil.
		capabilities.setCapability("udid", "J1AXB7604877647");
		// TO DO : Changer le numéro de version android en fonction de votre appareil.
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability(MobileCapabilityType.APP,
				System.getProperty("user.dir") + "\\src\\test\\resources\\apk\\RentACar.apk");
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
	public void beforeMethod(Method method) {
		testName.set(method.getName());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Le test " + testName.get() + " est terminé.");
	}

	@AfterSuite
	public void teardown() {
		
		/**
		 * ExtentReport Setup
		 */
		extent.flush();
		
		/**
		 * ApkDriver Setup
		 */
		
		driver.quit();
		System.out.println("===============================================");
		System.out.println("-----------------Test finish !-----------------");
		System.out.println("===============================================");

	}

}
