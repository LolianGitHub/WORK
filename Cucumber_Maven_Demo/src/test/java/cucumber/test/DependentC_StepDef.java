package cucumber.test;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import utility.BaseUtil;


public class DependentC_StepDef extends BaseUtil
{
	private BaseUtil base;
	Scenario scenario;
	public DependentC_StepDef(BaseUtil base)
	{
		this.base = base;
	}
	
	@Given("^Valid set of data and access$")
	public void valid_User_Check() throws Throwable
	{
		System.out.println("Accessing Driver:"+base.driver);
	}
}