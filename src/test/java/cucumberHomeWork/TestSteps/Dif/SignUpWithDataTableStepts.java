package cucumberHomeWork.TestSteps.Dif;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpWithDataTableStepts extends BaseClass {

	    @Given("^I open Browser$")
	    public void i_open_Browser()  {
	        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	    }

	    @Given("^I navigate to the FreeCRM$")
	    public void i_navigate_to_the_FreeCRM() throws InterruptedException  {
	        driver.get("https://www.freecrm.com/index.html");
	        Thread.sleep(3000);
	    }
	    @Given("^I click on signUp button$")
	    public void i_click_on_signUp_button()  {
	         driver.findElement(By.xpath("//font[@color='red']")).click();
	    }

	    @When("^I provide the following details$")
	    public void i_register_to_account(DataTable registerInfo) throws InterruptedException  {
	        
	    List< Map<String, String>> maps = registerInfo.asMaps(String.class, String.class);
	    
	    for (Map<String, String>map: maps){
	        
	         WebElement edition = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	         Select select = new Select(edition);
	         select.selectByVisibleText(map.get("Edition"));
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(map.get("fName"));
	         driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(map.get("lName"));
	         driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(map.get("email"));
	         driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(map.get("confirmEmail"));
	         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(map.get("uName"));
	         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(map.get("password"));
	         driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(map.get("confirmPassword"));
	         driver.findElement(By.xpath("//input[@value='false']")).click();
	         driver.findElement(By.xpath("//div[@class='myButton']")).click();
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	         Thread.sleep(2000);
	     	}
	    }
	    @Then("^I close the browser$")
	    public void i_close_my_browser() throws Throwable {
	        driver.quit();
	    }
	}

