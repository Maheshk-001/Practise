package Mahesh;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecomm_tc_2 extends BaseTest{

	@Test
	
	public void FormFill() throws InterruptedException {
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mahesh Kumaran");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Barbados\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Barbados']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String ToastName= driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		assertEquals(ToastName, "Please enter your name");
		
	}
}
