package cucumber.features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnimalParamScenarioOutlineStepDef {

	WebDriver driver;
	
	@Before
	public void testStartUp(){
		System.out.println("This is before each scenario");
		driver = new FirefoxDriver();
	}
	
	@After
	public void testShutDown(){
		System.out.println("This is after each scenario");
		driver.quit();
	}
	
	@Given("^navigate to twy crosszoo website$")
	public void shouldNaviToTwycrosszooWebsite() throws Throwable {
		
		driver.navigate().to("https://twycrosszoo.org/");
	}

	@When("^click on \"([^\"]*)\"$")
	public void shouldClickOn(String link) throws Throwable {
		driver.findElement(By.xpath(link)).click();
	}

	@Then("^check page title is \"([^\"]*)\"$")
	public void shouldCheckPageTitle(String content) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains(content));
	}

	@And("^browser close$")
	public void exitTheBrowser() throws Throwable {
	   driver.close();
	}
}
