package cucumber.features;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuestionAboutOnlineHMRCServiceDef {
	
	WebDriver driver = null;
	
	@Given("^I am on the online hmrc gov question about form$")
	public void onlineHmrcGovQuestionAbtForm() throws Throwable {		
			driver = new FirefoxDriver();
	        driver.navigate().to("https://online.hmrc.gov.uk/shortforms/form/OSHVAT");
	}

	@When("^I entered the form with valid data$")
	public void enteredFormWithValidData(DataTable data) throws Throwable {
		
		List<List<String>> dataInfo = data.raw();
		driver.findElement(By.name(dataInfo.get(1).get(0))).sendKeys(dataInfo.get(1).get(1));
		driver.findElement(By.name(dataInfo.get(2).get(0))).sendKeys(dataInfo.get(2).get(1));
		driver.findElement(By.name(dataInfo.get(3).get(0))).sendKeys(dataInfo.get(3).get(1));
		driver.findElement(By.name(dataInfo.get(4).get(0))).sendKeys(dataInfo.get(4).get(1));
		driver.findElement(By.name(dataInfo.get(5).get(0))).sendKeys(dataInfo.get(5).get(1));
		

	}

	@And("^I click the form for next$")
	public void clickTheFormForNext() throws Throwable {
		
		driver.findElement(By.id("ButtonNext")).click();
		
	}

	@Then("^I checked that the form entered data$")
	public void checkedTheFormEnteredData(DataTable data) throws Throwable {
		List<List<String>> dataEnteredVerify = data.raw();
		Assert.assertTrue(driver.findElement(By.name(dataEnteredVerify.get(1).get(0))).getAttribute("value").contains(dataEnteredVerify.get(1).get(1)));
		Assert.assertTrue(driver.findElement(By.name(dataEnteredVerify.get(2).get(0))).getAttribute("value").contains(dataEnteredVerify.get(2).get(1)));
		Assert.assertTrue(driver.findElement(By.name(dataEnteredVerify.get(3).get(0))).getAttribute("value").contains(dataEnteredVerify.get(3).get(1)));
		Assert.assertTrue(driver.findElement(By.name(dataEnteredVerify.get(4).get(0))).getAttribute("value").contains(dataEnteredVerify.get(4).get(1)));
		Assert.assertTrue(driver.findElement(By.name(dataEnteredVerify.get(5).get(0))).getAttribute("value").contains(dataEnteredVerify.get(5).get(1)));
		
	}
	
	@And("^close the browser$")
	public void closeTheBrowser() throws Throwable {
      driver.close();
	}

}
