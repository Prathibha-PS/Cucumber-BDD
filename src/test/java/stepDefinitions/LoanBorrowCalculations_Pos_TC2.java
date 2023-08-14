package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoanBorrowCalculations_Pos_TC2 {
	WebDriver driver;

	
	@Given("User opens ANZ Bank website page")
	public void user_opens_anz_bank_website_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Prathi_p\\Selenium DRIVERS\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		    System.out.println("Browser launched successfully");
		    driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		    System.out.println("ANZ site is opened successfully");
	}
	@When("User navigates to home loan calculator page")
	public void user_navigates_to_home_loan_calculator_page() {
		//driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	    System.out.println("Page has navigated to ANZ home loan calculator page");
	}
	@When("User enters the annual income")
	public void user_enters_the_annual_income() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div/input")).sendKeys("80000");

	}
	@When("User also enters the annual other income")
	public void user_also_enters_the_annual_other_income() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/input")).sendKeys("10000");

	}
	@When("User enters Monthly living expenses")
	public void user_enters_monthly_living_expenses() {
		driver.findElement(By.xpath("//*[@id=\"expenses\"]")).sendKeys("100");
	}
	@When("User enters also Other loan monthly repayments")
	public void user_enters_also_other_loan_monthly_repayments() {
		 driver.findElement(By.xpath("//*[@id=\"otherloans\"]")).sendKeys("25");
	}
	@When("User gives Total credit card limits")
	public void user_gives_total_credit_card_limits() {
		driver.findElement(By.xpath("//*[@id=\"credit\"]")).sendKeys("50");
	}
	@Then("Validate borrow estimate calculation amount")
	public void validate_borrow_estimate_calculation_amount() {
		driver.findElement(By.xpath("//*[@id=\"btnBorrowCalculater\"]")).click();
		boolean status = driver.findElement(By.xpath("//*[@id=\"borrowResultTextAmount\"]")).isDisplayed();
		if(status) {
			System.out.println("Estimation Amount is calculated");
		}
		
		else {
			System.out.println("Estimation Amount is not been calculated");
		}
		
		//String expected = "482000";
		String expected = "482,000";
		String actual = driver.findElement(By.xpath("//*[@id=\"borrowResultTextAmount\"]")).getAttribute("value");
		Assert.assertEquals(expected, actual);
	}

	
}
