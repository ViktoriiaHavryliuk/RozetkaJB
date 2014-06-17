package atf;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetUpForPage {
		
	protected static WebDriver driver;
		
	public static boolean IsPresent(By element)
	{
		boolean value = false;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
	if (driver.findElement(element).isEnabled());
	
	{
	value = true;
	}
		} catch (NoSuchElementException e) {
	        System.out.println("Unable to locate element: " + element);
	    } 
	return value;
	}
       
	@BeforeScenario
	public void startDriver() throws Exception {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterScenario
	public void stopDriver() throws Exception {
		driver.close();
		
	}
		
	public WebDriver getDriver() {
		return driver;
	}
	
	public void open(String url) {
		driver.get(url);
	}

}
