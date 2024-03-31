package epallettest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrder {
  @Test
  public static void placeorder() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\zaytona\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://customer-staging.epallet.com/");
	  WebElement Signin=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/a[1]/button"));
	  Signin.click();
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  WebElement Email=driver.findElement(By.id("Email"));
	  Email.sendKeys("Qa.itg6.2021@gmail.com");
	  WebElement Password=driver.findElement(By.id("Password"));
	  Password.sendKeys("9Aug1997@@");
	  WebElement signinbtn=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/form/div/div[6]/button"));
	  signinbtn.click();
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  WebElement MeatSeaFood=driver.findElement(By.xpath("//*[@id=\"root-page\"]/main/div[1]/div/div/div/a[4]/div/div/div"));
	  MeatSeaFood.click();
	  try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   WebElement AddToCart=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/div[3]/div/div[2]/div/div[5]/div/button[2]"));
	      AddToCart.click();
	      try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  WebElement Cart=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/div/button"));
	  Cart.click();
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 // WebElement Price=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/p[1]/span"));
	 //String price=Price.toString();
	  WebElement Plusbtn=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/button"));
      Plusbtn.click();
      try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      //Assert.assertEquals(price, "$3,544.92");
	  WebElement preceedtocheckout=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/div/div/div[3]/div/button[2]"));
     preceedtocheckout.click();
     try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     WebElement ACHPayment=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div[2]/div[1]/label[2]/span[1]"));
     ACHPayment.click();
     WebElement Coupon=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/span/span/input"));
     Coupon.sendKeys("BULKBUY22");
     WebElement Apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/span/span/span/button"));
     Apply.click();
     try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     WebElement Notes=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div[3]/div/input"));
     Notes.sendKeys("Without any delay please.");

     WebElement placeorder=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div[6]/button[1]"));
     placeorder.click();
     try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     WebElement ThankYou=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/div[1]/div/h1"));
    if(ThankYou.isDisplayed())
    	System.out.println("Your order placed successfully");
	  
  }
}
