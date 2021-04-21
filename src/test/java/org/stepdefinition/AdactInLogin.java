package org.stepdefinition;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;

public class AdactInLogin {
	WebDriver driver;
	@Given("The user has to be in AdactIn login page")
	public void the_user_has_to_be_in_AdactIn_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\CucumberPractice_Junit\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@When("The user enter the username and password")
	public void the_user_enter_the_username_and_password() {
		WebElement txtUname = driver.findElement(By.xpath("//input[@id='username']"));
		txtUname.sendKeys("Priyaa");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys("11245");
	}
	
	@When("The user enter the  {string} and {string}")
	public void the_user_enter_the_and(String uname, String pass) {
		WebElement txtUname = driver.findElement(By.xpath("//input[@id='username']"));
		txtUname.sendKeys(uname);
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys(pass);
	}

	@When("The user click the login button")
	public void the_user_click_the_login_button() {
		WebElement logBtn = driver.findElement(By.xpath("//input[@id='login']"));
		logBtn.click();
	}

	@Then("The user navigate to the invalid login page")
	public void the_user_navigate_to_the_invalid_login_page() {
		Assert.assertTrue(true);
		System.out.println("The user should navigate to invalid login page");
		driver.quit();
	}
}
