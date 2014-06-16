package atf.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import atf.SetUpForPage;


/**
 * Created by Viktoriia_Havryliuk on 6/12/14.
 */
public class MainPage extends SetUpForPage {
    private static By enterButton = By.xpath("//*[@id='user_menu']/div/a");
    private static By username = By.name("login");
    private static By passWord = By.name("password");
    private static By button = By.cssSelector(".button-css-blue.auth-f-submit-btn");
    private static By item = By.xpath("//*[@id='head_banner_container']/div[4]/div[1]/div/div[3]/div[1]/div/ul/li[3]/a");

    public static ItemPage SelectItem(){
        driver.findElement(item).click();
        return new ItemPage();
    }


    public static void enteringLogin () {
        driver.findElement(enterButton).click();
    }

    public static void enterUserName(String userName) {
        assertTrue(IsEditable(username));
        driver.findElement(username).sendKeys(userName);
    }

    public static void enterPassord(String password) {
        assertTrue(IsEditable(passWord));
        driver.findElement(passWord).sendKeys(password);//
    }

    public static void pressEnterButton() {
        driver.findElement(button).click();
    }

}
