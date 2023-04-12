package Ecommerce;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	public AndroidDriver driver;
	
	@BeforeClass
	public void ConfigTest() throws MalformedURLException {
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Mahesh");
		//options.setChromedriverExecutable("C:\\Users\\Mahesh\\Downloads\\chromedriver_win32");
		//DesiredCapabilities desiredCap= new DesiredCapabilities();
		options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		options.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		options.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.5");
		options.setCapability(MobileCapabilityType.UDID, "42002e1b9657740b");
		options.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		options.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		
		 driver= new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
