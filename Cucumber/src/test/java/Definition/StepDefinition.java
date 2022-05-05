package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition {
	WebDriver driver;
	public String URL = "https://opensource-demo.orangehrmlive.com";
	
	@Given("Ishould be in the login page of orangeHRM")
	public void ishould_be_in_the_login_page_of_orange_hrm() {
	    // Write code here that turns the phrase above into concrete actions
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get(URL);
	}
	@When("Enter Name")
	public void enter_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	}
	@When("Enter Password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	}
	@When("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id= 'btnLogin']")).click();
	}
	@Then("Login Successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //check for the link welcome and here we can even check who logged in
        Assert.assertEquals(driver.getTitle(), "OrangeHrm");


}}
