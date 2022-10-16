package Testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.loginpageobjects;
import PageObjectModel.signuppageobjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonutilities;

public class signuptestcase extends BaseClass {
	@Test
	public void signup() throws IOException, InterruptedException {
	
	loginpageobjects lpo=new loginpageobjects(driver);
	lpo.Clicktryforfree().click();
	Thread.sleep(5000);
	
	signuppageobjects spo=new signuppageobjects(driver);
	spo.EnterFirstname().sendKeys("Sumedh");
	
	
	String actual=driver.getTitle();
	String expected= TestCaseData.ExpectedTitle;
	commonutilities.handleassertions(actual, expected);
	
	commonutilities.dropdownhandle(spo.SelectJobtitle(),1);
	commonutilities.dropdownhandle(spo.SelectCompanyemployees(),2);
	
	//To handle dropdown menu
	/*Select s=new Select(spo.SelectJobtitle());
	s.selectByIndex(1);*/
	
	spo.EnterCompany().sendKeys("Infosys");
	spo.EnterLastname().sendKeys("Phadnis");
	spo.EnterWorkemail().sendKeys("xyz@gmail.com");
	spo.Enterphone().sendKeys("123456790");
	
	
	
	driver.quit();
	
	
		

}
}