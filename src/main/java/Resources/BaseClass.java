package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver browserlaunch() throws IOException {
		
		//this will help us read data.properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\sansidson\\eclipse-workspace\\20testNGFramework\\src\\main\\java\\Resources\\data.properties");
		
		//this will access data.properties file
	    prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			//firefox code
		}
		return driver;
	}
	@BeforeMethod
	public void simultaneouslaunchbrowser() throws IOException {
		browserlaunch();
		driver.get(prop.getProperty("url"));
		
	}

}
