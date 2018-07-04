package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class StammdatenSuchen {
	private WebDriver driver;

	public StammdatenSuchen() {
		driver = Hook.getDriver();
	}

	@Given("^Ich rufe die Stammdaten auf$")
	public void ich_rufe_die_Stammdaten_auf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("^Ich sehe die Uebersicht Stammdaten$")
	public void ich_sehe_die_Uebersicht_Stammdaten() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


	@When("^Ich gebe im Suchfeld folgende Parameters '(\\d+)' ,'(\\d+)','(\\d+)'$")
	public void ich_gebe_im_Suchfeld_folgende_Parameters(String sNummer, String kNummer, String mNummer) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("insure-main-form:stammdatenNr:input")).clear();;
		driver.findElement(By.id("insure-main-form:stammdatenNr:input")).sendKeys(sNummer);
		Thread.sleep(1000);
		driver.findElement(By.id("insure-main-form:kundenNummer:input")).clear();;
		driver.findElement(By.id("insure-main-form:kundenNummer:input")).sendKeys(kNummer);
		Thread.sleep(1000);
		driver.findElement(By.id("insure-main-form:MitarbeiterNummer:input")).clear();;
		driver.findElement(By.id("insure-main-form:MitarbeiterNummer:input")).sendKeys(mNummer);
		Thread.sleep(1000);
		}

	@When("^Ich klicke Suchen$")
	public void ich_klicke_Suchen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.id("insure-main-form:j_idt351:button")).click();
		Thread.sleep(1000);
	}

	@Then("^Die gesuchte Stammdaten ist selektiert$")
	public void die_gesuchte_Stammdaten_ist_selektiert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Ich kann Detailansicht aufrufen$")
	public void ich_kann_Detailansicht_aufrufen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}
