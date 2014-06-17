package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;

public class HighPricePage extends SetUpForPage {
	
	private static By buy = By.xpath(".//*[@id='block_with_goods']/div[1]/div[1]/div[1]/div[1]/div/div/div[4]/div[2]/div/form/button");

    public static PopUpPage buyFirstItem(){
    	assertTrue(IsPresent(buy));
        driver.findElement(buy).click();
        return new PopUpPage();
    }

}
