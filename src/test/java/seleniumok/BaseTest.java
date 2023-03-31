package seleniumok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orgbatthad.constants.Frameworkconcepts;


public class BaseTest {

	WebDriver ok;

	@BeforeMethod
	public void setup()  {
		System.setProperty("webdriver.chromedriver", Frameworkconcepts.getChromeDriverpath());
		ok = new ChromeDriver(); 
		ok.get("https://google.com");
		ok.manage().window().maximize();
	}
	@AfterMethod 
	public void teardown() {

		ok.quit();
	}
}
