package atf.pages;

import org.openqa.selenium.By;

import atf.SetUpForPage;


/**
 * Created by Viktoriia_Havryliuk on 6/13/14.
 */
public class LowPricePage extends SetUpForPage {

    private static By buy = By.xpath("//*[@id='block_with_goods']/div/div[1]/div[1]/div[1]/div/div/div[4]/div[2]/div/form/button");

    public static PopUpPage buyFirstItem(){

        driver.findElement(buy).click();
        return new PopUpPage();

    }
}
