package com.steps;


import org.openqa.selenium.support.PageFactory;

import com.baselibrary.Baseclass;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.Commonfunction;
import com.pagesPF.Loginpage;
import com.pagesPF.Selectflight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps2 extends Baseclass{
	
	
	
	Loginpage lpf;
	Selectflight slf;
    public ConfigFileReader configFileReader;

    
    public Steps2()
    {
    	//driver = Browserfactory.selectBrowser("CHROME");
		lpf=PageFactory.initElements(driver,Loginpage.class);
		slf=PageFactory.initElements(driver,Selectflight.class);
		configFileReader=new ConfigFileReader();
		
    }
	
 

	@Given("^user is on login page$")
	public void when_user_launches()  {
		 driver.get(configFileReader.getApplicationUrl());
		 Commonfunction.maximiseBrowser(driver);

	}
	@When("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String username, String password) throws Throwable {
	    lpf.login(username, password);
	    Reporter.addStepLog("Login name is entered");

	}

	
	


}
