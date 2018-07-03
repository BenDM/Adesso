package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	@When("^Ich gebe eine (\\d+) und (\\d+) und <Mitabeiternummer> im Suchfeld ein$")
	public void ich_gebe_eine_und_und_Mitabeiternummer_im_Suchfeld_ein(String sNummer, String kNummer, String mNummer) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("insure-main-form:stammdatenNr:input")).clear();;
		driver.findElement(By.id("insure-main-form:stammdatenNr:input")).sendKeys(sNummer);
		Thread.sleep(10000);
		driver.findElement(By.id("insure-main-form:kundenNummer:input")).clear();;
		driver.findElement(By.id("insure-main-form:kundenNummer:input")).sendKeys(kNummer);
		Thread.sleep(10000);
		driver.findElement(By.id("insure-main-form:MitarbeiterNummer:input")).clear();;
		driver.findElement(By.id("insure-main-form:MitarbeiterNummer:input")).sendKeys(mNummer);
		Thread.sleep(50000);
	}

	@When("^Ich klicke Suchen$")
	public void ich_klicke_Suchen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
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
