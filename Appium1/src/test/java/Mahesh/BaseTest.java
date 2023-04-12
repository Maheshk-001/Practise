package Mahesh;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	
	public AndroidDriver driver;
	
	@BeforeClass
	public void ConfigTest() throws MalformedURLException {
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Mahesh");
		options.setChromedriverExecutable("C:\\Users\\Mahesh\\Downloads\\chromedriver_win32 (1)");
		//options.setApp("\\Users\\Mahesh\\eclipse-workspace\\Appium1\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		options.setApp("\\Users\\Mahesh\\eclipse-workspace\\Appium1\\src\\test\\java\\resources\\General-Store.apk");
	
		
		
		
		 driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//Utilities
	public void longPressTest(WebElement ele) {
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(), "duration", "2000"));
	}
	
	public void swipeAction(WebElement FirstImage ) {
		
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", 
				ImmutableMap.of("elementId",((RemoteWebElement)FirstImage).getId(),
						"direction", "left",
						"percent", 0.75
						));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
