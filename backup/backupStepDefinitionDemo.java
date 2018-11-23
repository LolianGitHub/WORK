package cucumber.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class backupStepDefinitionDemo 
{

	WebDriver driver;
	Scenario scenario;
	
	@Before()
	public void testSetUp(Scenario scenario)
	{
		this.scenario = scenario;
		driver = new ChromeDriver();
		System.out.println("Setup");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown(Scenario scenario)
	{
		scenario.write("Finishied scenario");
		if (scenario.isFailed())
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
			System.out.println("Test Environment Destoryed");
			System.out.println("------------");
			driver.close();
			driver.quit();
		
	}
	
	@Given ("^I've a valid set of data and access$")
	public void ValidUserCheck() throws Throwable
	{
		//System.out.println("Valid User");
		//driver = new ChromeDriver();
		System.out.println("Test Environment Set up Tagname : Registration");
	}
	
	@When ("^Registration page Display$")
	public void registrationDisplay() throws Throwable 
	{
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER")));
		
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", register);
		register.click();
	}
	
	@Then ("^Enter Valid Data$")
	public void enterValidData(DataTable userdetails) throws Throwable
	{
		List<List<String>> data = userdetails.raw();
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i).toString());
		}
		
		driver.findElement(By.xpath("//input [@id=\"email\"]")).sendKeys(data.get(0).get(1).toString());
		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1).toString());
		driver.findElement(By.name("confirmPassword")).sendKeys(data.get(2).get(1).toString());
	
	}
	
	@Then ("^Click Submit$")
	public void click_Submit() throws Throwable
	{
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}
	
	@Then("^Click Signoff$")
	public void click_Signoff() throws Throwable
	{
		System.out.println("Clicking on::"+driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
	}
	@And("^Close$")
	public void close() throws Throwable
	{
		System.out.println("quick browser");
	}
}
