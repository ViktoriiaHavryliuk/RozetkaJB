package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;


/**
 * Created by Viktoriia_Havryliuk on 6/13/14.
 */
public class ItemPage extends SetUpForPage{
    private static By LowPrice = By.xpath("//*[@id='head_banner_container']/div[4]/div/div/div[2]/div[3]/ul/li[4]/ul/li[2]/a");
    private static By HighPrice = By.xpath("//*[@id='head_banner_container']/div[4]/div/div/div[2]/div[3]/ul/li[4]/ul/li[4]/a");

    public static LowPricePage SelectLowPrice(){
    	assertTrue(IsPresent(LowPrice));
        driver.findElement(LowPrice).click();
        return new LowPricePage();
    }
    
    public static HighPricePage SelectHighPrice(){
    	assertTrue(IsPresent(HighPrice));
        driver.findElement(HighPrice).click();
        return new HighPricePage();
    }

}
