package cucumberHomeWork.TestSteps.Dif;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp_Login_Steps {

	WebDriver driver;
    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
    	WebDriverManager.chromedriver().setup();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\com.cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();// for windows use .maximize
    }
    @Given("^I navigate to the FreeCrm$")
    public void i_navigate_to_the_FreeCrm() throws Throwable {
        driver.get("https://www.freecrm.com/index.html");
    }
    @When("^I create/SignUp new user account$")
    public void i_create_SignUp_new_user_account() throws Throwable {
    	driver.findElement(By.linkText("//font[@color='red']")).click();
    	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Farhad");
    	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Darya");
    	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("darya.farhad@yahoo.com");
    	driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("darya.farhad@yahoo.com");
    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("F.Darya");
    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fd2018");
    	driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Fd2018");
    	driver.findElement(By.xpath("//input[@value='false']")).click();
    	driver.findElement(By.xpath("//div[@class='myButton']")).click();
    	Thread.sleep(3000);
    }
    @When("^I insert accurate username and password$")
    public void i_insert_accurate_username_and_password() throws Throwable {
        driver.findElement(By.name("username")).sendKeys("F.Darya");
        driver.findElement(By.name("password")).sendKeys("Fd2018");
    }
    @When("^I click Login button$")
    public void i_click_Login_button() throws Throwable {
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
       //System.out.println("click login");
    }
    @Then("^I successfully logged in$")
    public void i_successfully_logged_in() throws Throwable {
        System.out.println("succesfully login");
    }
}
