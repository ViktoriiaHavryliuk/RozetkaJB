package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;

/**
 * Created by Viktoriia_Havryliuk on 6/13/14.
 */
public class CheckOutPage extends SetUpForPage {
	
	private static By Name = By.id("reciever_name");
	private static By City = By.id("suggest_locality");
	private static By FirstChoose = By.xpath("//*[@id='step_contacts']/div/div[1]/div[1]/div[2]/div[2]/div/div/div/ul/li[1]");
    private static By Phone = By.xpath("//*[@id='reciever_phone']");
    private static By Next = By.xpath("//*[@id='step_contacts']/div/div[1]/div[3]/div/span/button");

    public static void enterUserName(String user) {
        assertTrue(IsPresent(Name));
        driver.findElement(Name).sendKeys(user);
    }
    
    public static void enterCity() {
    	assertTrue(IsPresent(City));
        driver.findElement(City).click();
        assertTrue(IsPresent(FirstChoose));
        driver.findElement(FirstChoose).click();
    }
    
    public static void enterPhone(String phone) {
        assertTrue(IsPresent(Phone));
        driver.findElement(Phone).sendKeys(phone);
    }

    public static DeliveryStepPage enterNext() {
    	assertTrue(IsPresent(Next));
        driver.findElement(Next).click();
        return new DeliveryStepPage();
    }
}

