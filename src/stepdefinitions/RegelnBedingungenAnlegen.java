package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;;

public class RegelnBedingungenAnlegen {
	private WebDriver driver;

	public RegelnBedingungenAnlegen() {
		this.driver = Hook.getDriver();
	}


	@Given("^Ich rufe die <Regeln> auf$")
	public void ich_rufe_die_Regeln_auf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("^Ich rufe die <Maske \\(Neu\\)> auf$")
	public void ich_rufe_die_Maske_Neu_auf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^Ich fuege die Daten ein$")
	public void ich_fuege_die_Daten_ein() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("insure-main-form:stammdatenNr:input")).clear();
		driver.findElement(By.id("insure-main-form:stammdatenNr:input")).sendKeys("stammdatenNr1");

		driver.findElement(By.id("insure-main-form:kundenNummer:input")).clear();
		driver.findElement(By.id("insure-main-form:kundenNummer:input")).sendKeys("kundenNummer1");

		driver.findElement(By.id("insure-main-form:MitarbeiterNummer:input")).clear();
		driver.findElement(By.id("insure-main-form:MitarbeiterNummer:input")).sendKeys("MitarbeiterNummer1");

	}

	@When("^Ich klicke Speichern$")
	public void ich_klicke_Speichern() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("insure-main-form:j_idt350:button")).click();
	}

	@Then("^Ich sehe die Uebersicht <Regeln>$")
	public void ich_sehe_die_Uebersicht_Regeln() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Die angelegte <Regeln> ist selektiert$")
	public void die_angelegte_Regeln_ist_selektiert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Die eingegebenen Daten sind vorhanden$")
	public void die_eingegebenen_Daten_sind_vorhanden() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	}



}
