package atf.pages;

import org.openqa.selenium.By;

import atf.SetUpForPage;


/**
 * Created by Viktoriia_Havryliuk on 6/13/14.
 */
public class DeliveryStepPage extends SetUpForPage {
    private static By deliveryStatus = By.xpath("//*[@id='total_block']/div[1]/div[2]/div[2]");
    private static By gift = By.xpath("//*[@id='orders']/div/div/div[1]/div[2]");


    public static boolean DeliveryStatus(String message) {
        if (driver.findElement(deliveryStatus).isEnabled()){
            return driver.getPageSource().contains(message);
        } else{
            return false;
        }
    }
    
    public static boolean CheckGiftPresent() {
        if (driver.findElement(gift).isEnabled()){
            return true;
        } else{
            return false;
        }
    }
}
