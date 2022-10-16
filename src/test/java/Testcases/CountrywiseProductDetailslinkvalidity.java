package Testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ProductDetailslinkvaliditypageobjects;
import PageObjectModel.loginpageobjects;
import Resources.BaseClass;

public class CountrywiseProductDetailslinkvalidity extends BaseClass { 
	@Test
	public void linkvalidity () throws MalformedURLException, IOException, InterruptedException {
		loginpageobjects lpo=new loginpageobjects(driver);
		lpo.Clicktryforfree().click();
		Thread.sleep(5000);
		ProductDetailslinkvaliditypageobjects pdo=new ProductDetailslinkvaliditypageobjects (driver);
		pdo.WorldWidebutton().click();
		//driver.findElement(By.xpath("//div[@class='surround btn btn-outline-primary border-white']")).click();
		List<WebElement> links=pdo.Links();
		System.out.println("No. of links :"+" "+links.size());
		//List<WebElement> links=driver.findElements(By.xpath("//ul[@class='generic-links  ']//a"));
		SoftAssert a =new SoftAssert(); 
		  
        for(WebElement link : links)
        {
            String url= link.getAttribute("href");
            HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
           a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
        }
        
       a.assertAll();
       
       driver.quit();

		
	}
	

}
////ul[@class='generic-links  ']