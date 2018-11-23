package cucumber.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class StepDefinitionDocString 
	{
		@When ("^You Navigated to a the Website$")
		public void navigatedWebsite() throws Throwable
		{
			System.out.println("Navigated to website");
		}
		
		@And ("^Check the website and found the details:$")
		public void checkDetails (String details) throws PendingException
		{
			System.out.println("\nChecking Details");
			System.out.println("\nExpected Text:" + details);
			String websiteTxt = "";
			//WebElement faq.getText().equals(details)
					if (websiteTxt.equals(details) == true)
					{
						System.out.println("\nExpected text");
					}
					else
						System.out.println("\nUnexpect");
		}
		
		
		
		
	}