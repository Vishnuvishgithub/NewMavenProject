package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

	WebDriver driver;
	
	   public LoginPageObjects(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	
	By uname = By.name("user-name");
	By pass= By.name("password"); 
   By logbutton = By.name("login-button");
			
			
			public void username (String user)
			{
				driver.findElement(uname).sendKeys(user);
			}
			
			
			public void password (String ps)
			{
				driver.findElement(pass).sendKeys(ps);
			}
			
			
			public void button ()
			{
				driver.findElement(logbutton).click();
			}
			
			
			
}
