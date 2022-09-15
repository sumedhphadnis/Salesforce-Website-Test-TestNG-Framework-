package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailslinkvaliditypageobjects {
	public WebDriver driver;
	
	private By ProdDetail=By.xpath("//div[@class='surround btn btn-outline-primary border-white']");
	private By Linklist=By.xpath("//ul[@class='generic-links  ']//a");
	
	public ProductDetailslinkvaliditypageobjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	public WebElement WorldWidebutton() {
		return driver.findElement(ProdDetail);
	}
	public List<WebElement> Links() {
		return driver.findElements(Linklist);
	}

}
