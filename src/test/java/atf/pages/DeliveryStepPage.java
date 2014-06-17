package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;


/**
 * Created by Viktoriia_Havryliuk on 6/13/14.
 */
public class DeliveryStepPage extends SetUpForPage {
	private static By deliveryStatus = By.xpath("//*[@id='orders']/div/div/div[2]/div/div[2]/div[2]/ul/li/div[1]/div/div/div");
	private static By gift = By.xpath("//*[@id='orders']/div/div/div[1]/div[2]");
	private static By courier = By.xpath("//*[@id='orders']/div/div/div[2]/div/div[2]/ul/li[2]/a");

	public static boolean DeliveryStatus(String message) throws InterruptedException {
		for (int second = 0;; second++) {
			try { if (driver.findElement(deliveryStatus).isEnabled()) break;
			} catch (Exception e) {} 
			Thread.sleep(1000);
		}
		return driver.findElement(deliveryStatus).getText().contains(message);

	}

	public static void SetDelivery() throws InterruptedException {
		assertTrue(IsPresent(courier));
		driver.findElement(courier).click();
	}

	public static boolean CheckGiftPresent() {
		
		if (driver.findElement(gift).isEnabled()){
			return true;
		} else{
			return false;
		}
	}
}
