package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;



/**
 * Created by Viktoriia_Havryliuk on 6/13/14.
 */
public class PopUpPage extends SetUpForPage {
    private static By Checkout = By.xpath("//*[@id='popup-checkout']");
    private static By Quontity = By.name("quantity");
    private static By Check = By.xpath("//*[@id='cart-popup']/div/div/div[1]/div[2]/div/div[4]/div/a/img");

    public static CheckOutPage buyItem(){
        driver.findElement(Checkout).click();
        return new CheckOutPage();
    }
    
    public static void AddQuontity(String qty){
        driver.findElement(Quontity).clear();
        assertTrue(IsEditable(Quontity));
        driver.findElement(Quontity).sendKeys(qty);
        driver.findElement(Check).click();
    }
}
