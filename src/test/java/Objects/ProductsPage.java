package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

WebDriver driver;	
	
     public ProductsPage(WebDriver driver)
     {
    	 this.driver=driver;
     }
	
	 By pro1= By.id("add-to-cart-sauce-labs-backpack");
     By pro2= By.id("add-to-cart-sauce-labs-bolt-t-shirt");
     By pro3= By.id("add-to-cart-sauce-labs-onesie");
     By pro4=By.id("add-to-cart-sauce-labs-bike-light");
     By pro5=By.id("add-to-cart-sauce-labs-fleece-jacket");
     By pro6=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	
     
     public void product1()
     {
    	 driver.findElement(pro1).click();
     }
     
     
     public void product2()
     {
    	 driver.findElement(pro2).click();
     }
     
      public void product3()
     {
    	 driver.findElement(pro3).click();
     }
     
     public void product4()
     {
    	 driver.findElement(pro4).click();
     }
     
     public void product5()
     {
    	 driver.findElement(pro6).click();
     }
     
     public void product6()
     {
    	 driver.findElement(pro6).click();
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
