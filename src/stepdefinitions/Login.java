package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import utility.Hook;

public class Login {
	private WebDriver driver;
	public Login() {
		this.driver = Hook.getDriver();
	}

	@Given("^Ich bin als Admin eingeloggt$")
	public void ich_bin_als_Admin_eingeloggt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:9091/insuria-commission-web-war/suche.xhtml");
//		System.out.println("Current url : " + driver.getCurrentUrl());
	}
}
