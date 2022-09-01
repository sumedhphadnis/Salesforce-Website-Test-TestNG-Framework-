package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppageobjects {
	public WebDriver driver;
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By workemail=By.xpath("//input[@name='UserEmail']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By companyemployees=By.xpath("//select[@name='CompanyEmployees']");
	
	public signuppageobjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterFirstname() {
		return driver.findElement(firstname);
	
}
	public WebElement EnterLastname() {
		return driver.findElement(lastname);
	}
	public WebElement EnterWorkemail() {
		return driver.findElement(workemail);
	}
	public WebElement EnterCompany() {
		return driver.findElement(company);
	}
	public WebElement SelectJobtitle() {
		return driver.findElement(jobtitle);
	}
	public WebElement Enterphone() {
		return driver.findElement(phone);
	}
	public WebElement SelectCompanyemployees() {
		return driver.findElement(companyemployees);
	}
}
	

