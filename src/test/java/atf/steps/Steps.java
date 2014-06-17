package atf.steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;




import static org.junit.Assert.assertTrue;
import atf.SetUpForPage;
import atf.pages.CheckOutPage;
import atf.pages.DeliveryStepPage;

import atf.pages.ItemPage;
import atf.pages.LowPricePage;
import atf.pages.MainPage;
import atf.pages.PopUpPage;


/**
 * Created by Viktoriia_Havryliuk on 6/12/14.
 */
public class Steps extends SetUpForPage {
    private Map<String, String> message;

    String login ="testfortestvalid@gmail.com";
    String password ="testtest123";
    String user = "test";
    String phone ="0123456789";
    String qty ="30";

    @Given("home page $url")
    public void givenBasePage(String url) {
        open(url);
    }

    @Given("the user choose item")
    public void ChooseItemLowPrice() {
        MainPage.SelectItem();
        ItemPage.SelectLowPrice();

    }
    
    @Given("the user choose item with price more then or equal 1500 uah")
    public void ChooseItemHighPrice() {
        MainPage.SelectItem();
        ItemPage.SelectHighPrice();

    }
    
    @Given("the user choose item with price more then or equal 20000 uah")
    public void ChooseItemHighPriceAndQty() {
        MainPage.SelectItem();
        ItemPage.SelectHighPrice();

    }
    
    

    @When("user buy item, that costs less then 1500 uah")
    public void whenEnteredValidData() throws InterruptedException {
        LowPricePage.buyFirstItem();
        PopUpPage.buyItem();
        CheckOutPage.enterUserName(user);
        CheckOutPage.enterCity();
        CheckOutPage.enterPhone(phone);
        CheckOutPage.enterNext();
        DeliveryStepPage.SetDelivery();
    }
    
    @When("user buy item, that costs more or equal than 1500 uah")
    public void whenEnteredValidDataMore1500() throws InterruptedException {
        LowPricePage.buyFirstItem();
        PopUpPage.buyItem();
        CheckOutPage.enterUserName(user);
        CheckOutPage.enterCity();
        CheckOutPage.enterPhone(phone);
        CheckOutPage.enterNext();
        DeliveryStepPage.SetDelivery();
    }
    
    @When("user buy item, that costs more or equal than 20000 uah")
    public void whenEnteredValidDataMore20000() throws InterruptedException {
        LowPricePage.buyFirstItem();
        PopUpPage.AddQuontity(qty);
        PopUpPage.buyItem();
        CheckOutPage.enterUserName(user);
        CheckOutPage.enterCity();
        CheckOutPage.enterPhone(phone);
        CheckOutPage.enterNext();
        DeliveryStepPage.SetDelivery();
    }
    
    @Then("delivery will cost: $examplesTable")
    public void ExpectingErrorMessage(ExamplesTable examplesTable) throws InterruptedException {
        message = examplesTable.getRow(0);
        assertTrue(DeliveryStepPage.DeliveryStatus(message.get("message")));
    }
    
    @Then("we also have free gift")
    public void ExpectingGift() {
        assertTrue(DeliveryStepPage.CheckGiftPresent());
    }

}
