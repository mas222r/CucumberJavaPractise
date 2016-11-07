package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyFirstStepDef {
	
	WebDriver driver = null;
	
	@Given("^I navigated to twycrosszoo website$")
	public void shouldNavigatedToTwycrosszooWebsite() throws Throwable {
	   driver = new FirefoxDriver();
	   driver.navigate().to("https://twycrosszoo.org/");
	}

	@When("^I click on animals$")
	public void shouldClickOnAnimals() throws Throwable {
	    driver.findElement(By.xpath("//a[@href='https://twycrosszoo.org/animals/']")).click();
	}

	@Then("^I navigated to mamals$")
	public void shouldNavigatedToMamals() throws Throwable {
		driver.findElement(By.id("menu-item-169")).click();
		Assert.assertTrue("Animal:mamal", driver.findElement(By.xpath("//*[@id='post-168']/header/h1/span/a")).equals("Other-- Mamals"));
	}

}
