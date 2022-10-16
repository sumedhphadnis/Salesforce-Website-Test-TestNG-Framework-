package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.loginpageobjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonutilities;

public class verifylogintestcase extends BaseClass {
	@Test
	public void login() throws IOException, InterruptedException {
		
		loginpageobjects lpo=new loginpageobjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.Clicklogin().click();
		Thread.sleep(4000);
		
		String expected=TestCaseData.ExpectedTitleLogin;
		String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		commonutilities.handleassertions(actual, expected);
		
		
		
		driver.quit();
	}
	

}
