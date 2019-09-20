package Outils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AppliManager{
	public static AppiumDriver<MobileElement> driver;
	public static FluentWait<WebDriver> wait; 
	
	public static void scrollBas(){

		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		PointOption pressOptions =null;
		PointOption moveToOptions = null ;
		Double screenW = dimensions.getWidth() * 0.5;
		int screenWidth = screenW.intValue();
		new TouchAction(driver).press(pressOptions.point(screenWidth,scrollStart)).waitAction().moveTo(moveToOptions.point(screenWidth,scrollEnd)).release().perform();
		} 

}
