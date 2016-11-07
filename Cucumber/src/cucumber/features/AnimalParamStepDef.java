package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AnimalParamStepDef {
	
	WebDriver driver = null;
	
	@Given("^I navigated to twy crosszoo website$")
	public void shouldNaviToTwycrosszooWebsite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://twycrosszoo.org/");
	}

	@When("^I click on \"([^\"]*)\"$")
	public void shouldClickOn(String link) throws Throwable {
		driver.findElement(By.xpath(link)).click();
	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void shouldCheckPageTitle(String content) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains(content));
	}

	@And("^I close the browser$")
	public void shouldCloseTheBrowser() throws Throwable {
	   driver.close();
	}

}
