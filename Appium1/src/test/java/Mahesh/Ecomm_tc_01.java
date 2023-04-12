package Mahesh;

import static org.testng.Assert.assertEquals;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecomm_tc_01 extends BaseTest{

	@Test
	
	public void FormFill() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mahesh Kumaran");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Barbados\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Barbados']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		int productCount= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i=0;i<productCount;i++) {
			String prodName= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(prodName.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
			}
			
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
			
			
			//to check whether the right product added to cart
			//WebDriverWait wait= new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
			//wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
			//String cartpage= driver.findElement(By.id("com.androidsample.generalstore:id/productNam")).getText();
			//assertEquals(cartpage, "Jordan 6 Rings" );
	
		}
		
	}
	
}
