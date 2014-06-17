package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;


/**
 * Created by Viktoriia_Havryliuk on 6/12/14.
 */
public class MainPage extends SetUpForPage {

	private static By item = By.xpath("//*[@id='head_banner_container']/div[4]/div[1]/div/div[3]/div[1]/div/ul/li[3]/a");

    public static ItemPage SelectItem(){
    	assertTrue(IsPresent(item));
        driver.findElement(item).click();
        return new ItemPage();
    }
}
