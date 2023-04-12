package Mahesh;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBas extends BaseTest {
	
	@Test
	
	public void AppiumTest() throws MalformedURLException {
		//AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Mahesh\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1")
			//	.usingPort(4723).build();
	//	service.start();
				
	
		//xpath, id, accessability, classname, androiduiAutomator
		ConfigTest();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//xpath: //@Tagname[attributes='Value']
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		//verify the text title
		String alertText= driver.findElement(By.id("android:id/alertTitle")).getText();
		assertEquals(alertText, "WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("Maheshwifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();//2 buttons in one popup use index
		
		
		tearDown();
		
		
		
		
	}
	

}
