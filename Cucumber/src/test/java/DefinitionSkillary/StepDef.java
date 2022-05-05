package DefinitionSkillary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDef {
	WebDriver driver;
	public String URL = "https://demoapp.skillrary.com/";
	
	

	@Given("i should open the browser and naviagte to the login page of skillrary")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_skillrary() {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.navigate().to("https://demoapp.skillrary.com/login.php?type=login");
	  
	   
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	 
	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	
	}
	@When("Click on the loginbutton")
	public void click_on_the_loginbutton() {
		driver.findElement(By.id("last")).click();
	 
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		System.out.println(username);
		Assert.assertEquals(username, string);
	
	}
	@Then("i should see the admin as {string}")
	public void i_should_see_the_admin_as(String string) {
	 
	  String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
	  System.out.println(admin);
      Assert.assertEquals(admin, string);
	}
	
	
	@Then("i should navigate to the page {string}")
	public void i_should_navigate_to_the_page(String string) {
		String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
		System.out.println(Register);
		 Assert.assertEquals(Register, string);
	}
	

	
}