package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoanBorrowCalculations_NegTC1 {
	WebDriver driver;
	
	@Given("User opens ANZ Bank website")
	public void user_opens_anz_bank_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Prathi_p\\Selenium DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    System.out.println("Browser launched successfully");
	    driver.get("https://www.anz.com.au/");
	    System.out.println("ANZ site is opened successfully");
	    //throw new io.cucumber.java.PendingException();
	}
	@When("User navigates to ANZ home loan calculator page")
	public void user_navigates_to_anz_home_loan_calculator_page() {
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	    System.out.println("Page has navigated to ANZ home loan calculator page");
	}
	@When("User enters annual income \\(before tax)")
	public void user_enters_annual_income_before_tax() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div/input")).sendKeys("80000");
	}
	@When("User also enters annual other income \\(optional)")
	public void user_also_enters_annual_other_income_optional() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/input")).sendKeys("10000");
	}
	@When("User enters his\\/her Monthly living expenses")
	public void user_enters_his_her_monthly_living_expenses() {
		driver.findElement(By.xpath("//*[@id=\"expenses\"]")).sendKeys("500");
	}
	@When("User enters Other loan monthly repayments")
	public void user_enters_other_loan_monthly_repayments() {
	    driver.findElement(By.xpath("//*[@id=\"otherloans\"]")).sendKeys("100");
	}
	@When("User Total credit card limits")
	public void user_total_credit_card_limits() {
		driver.findElement(By.xpath("//*[@id=\"credit\"]")).sendKeys("10000");
	}
	@Then("Validate the borrow estimate calculation")
	public void validate_the_borrow_estimate_calculation() {
		driver.findElement(By.xpath("//*[@id=\"btnBorrowCalculater\"]")).click();
		boolean status = driver.findElement(By.xpath("//*[@id=\"borrowResultTextAmount\"]")).isDisplayed();
		if(status) {
			System.out.println("Estimation Amount is calculated");
		}
		
		else {
			System.out.println("Estimation Amount is not been calculated");
		}
		
		//String expected = "482000";
		int expected = 482000;
		String actual = driver.findElement(By.xpath("//*[@id=\"borrowResultTextAmount\"]")).getAttribute("value");
		Assert.assertEquals(expected, actual);
		
	}
	
	


}
