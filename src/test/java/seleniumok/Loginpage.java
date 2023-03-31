package seleniumok;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class  Loginpage extends BaseTest { 


	@Test
	public void test1()

	{
	  ok.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);

	}


	@Test
	public void test2()

	{

    ok.findElement(By.name("q")).sendKeys("AWS",Keys.ENTER);
	
	}
	
}