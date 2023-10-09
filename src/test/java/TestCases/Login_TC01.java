package TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.LoginPageObjects;
import Objects.ProductsPage;

public class Login_TC01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");

		//import LoginPageObjects
		
		LoginPageObjects lp = new LoginPageObjects(driver);
		
		lp.username("standard_user");
		Thread.sleep(1500);
		
		lp.password("secret_sauce");
		Thread.sleep(1000);
		
		lp.button();
		
		
		ProductsPage pp= new ProductsPage(driver);
		
		pp.product2();
		pp.product4();
		pp.product6();
		
		
		
		
		
		
		
		
	}

}
