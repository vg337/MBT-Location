package Outils;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppliManager{
	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 60);
}
