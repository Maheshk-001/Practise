package Mahesh;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;



public class SwipeImage extends BaseTest {
	
	@Test
	
	public void SwipeImages() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
		WebElement FirstImage= driver.findElement(By.xpath("//android.widget.ImageView [1]"));
		assertEquals(driver.findElement(By.xpath("//android.widget.ImageView [1]")).getAttribute("focusable"), "true");
		swipeAction(FirstImage);
		assertEquals(driver.findElement(By.xpath("//android.widget.ImageView [1]")).getAttribute("focusable"), "false");
		
		
		
		

		
	}
	

}
