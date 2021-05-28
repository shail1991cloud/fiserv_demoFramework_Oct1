package com.pagesPF;
import com.helperUtilities.Constant;
import com.helperUtilities.DatesHelper;
import com.helperUtilities.EnvSetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
	this.driver=driver;
	} 
	@FindBy(how=How.XPATH ,using = "//input[@type='text' and @name='userName']")
	WebElement uname;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement pwd;
	@FindBy(how = How.XPATH, using = "//td[2]/div/input[@type='submit']")	
	WebElement submit;
	
	public void login(String userid,String password) throws InterruptedException
	{

		String UniqueUser_ID=userid+ DatesHelper.getTodayDateWithHMS();
		EnvSetUp.setDataValue(Constant.userID,UniqueUser_ID);
		uname.clear();
		uname.sendKeys(UniqueUser_ID);
		pwd.clear();
		pwd.sendKeys(password);
		submit.click();
		Thread.sleep(4000);
		
		
	}

}
