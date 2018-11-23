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

public class StepDefinitionDemo 
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
		System.out.println("Test Environment Set up Tagname : ShoppingWriteReview");
	}
	
	@When ("^Home page Display$")
	public void registrationDisplay() throws Throwable 
	{
		driver.navigate().to("https://www.henryschein.co.nz/");
		driver.manage().window().maximize();

	}
	
	@Then("^Enter Shopping Page$")
	public void EnterShoppingPage() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='image image-1']")));
		
		WebElement shopping = driver.findElement(By.xpath("//div[@class='image image-1']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", shopping);
		shopping.click();
	}
	
	@Then("^Select Brands Category$")
	public void SelectBrandsCategory() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/brands']//img[@class='product-img']")));
		
		WebElement brands = driver.findElement(By.xpath("//a[@href='/brands']//img[@class='product-img']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", brands);
		brands.click();
	}
	
	@Then("^Select Acteon Category$")
	public void SelectActeonCategory() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Acteon')]")));
		
		WebElement acteon = driver.findElement(By.xpath("//span[contains(text(),'Acteon')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", acteon);
		acteon.click();
	}
	
	@Then("^Select Prduct named RISKONTROL Adapter LU INOX$")
	public void SelectProduct() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'RISKONTROL Adapter LU INOX 1 Piece')]")));
		
		WebElement riskontrol = driver.findElement(By.xpath("//a[contains(text(),'RISKONTROL Adapter LU INOX 1 Piece')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", riskontrol);
		riskontrol.click();
	}
	
	@Then ("^Click Write a Review$")
	public void click_WriteReview() throws Throwable
	{
		driver.findElement(By.xpath("//span[contains(@id, 'goto-review')][2]")).click();
	}
	
	@Then ("^Enter Valid Data$")
	public void enterValidData(DataTable userdetails) throws Throwable
	{
		List<List<String>> data = userdetails.raw();
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i).toString());
		}
		
		driver.findElement(By.xpath("//input[@type = 'text'][@class = 'form-text'][@data-value-update = 'keyup change input']")).sendKeys(data.get(0).get(1).toString());
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(1).get(1).toString());
		driver.findElement(By.xpath("//div[@class='write-review']//div[4]//input[1]")).sendKeys(data.get(2).get(1).toString());
		driver.findElement(By.xpath("//div[@class='write-review']//div[5]//input[1]")).sendKeys(data.get(3).get(1).toString());

	}
	
	@Then ("^Click Submit$")
	public void click_Submit() throws Throwable
	{
		driver.findElement(By.xpath("//button[contains(text(),'Submit Review')]")).click();
	}
	

	@And("^Close$")
	public void close() throws Throwable
	{
		System.out.println("quick browser");
	}
}
