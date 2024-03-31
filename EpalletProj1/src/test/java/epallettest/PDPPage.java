package epallettest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import epallettest.LoginPage;

public class PDPPage {
	
  @Test
  public static void PDP() {
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

	  WebElement ViewDetails=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/div[3]/div/div[1]/div/div[2]/div/div[2]/a"));
	  ViewDetails.click();
	  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  WebElement Name=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/span"));
	  Assert.assertTrue(Name.isDisplayed(), "The product Name is not displayed.");
	  WebElement PackSize=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]"));
	  Assert.assertTrue(PackSize.isDisplayed(), "The product Pack Size is not displayed.");
	  WebElement LeadTime=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/span[1]"));
	  Assert.assertTrue(LeadTime.isDisplayed(), "The product Lead Time is not displayed.");
	  WebElement Cases=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]"));
	  Assert.assertTrue(Cases.isDisplayed(), "The Cases per pallet is not displayed.");
	  WebElement Discreption=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]"));
	  Assert.assertTrue(Discreption.isDisplayed(), "The Discreption is not displayed.");
	  WebElement PricesSection = driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[2]/div[1]"));
	  Assert.assertTrue(PricesSection.isDisplayed(), "The QuantityElement is not displayed.");
	  WebElement Plusbtn=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div/div/div[3]/button"));
      //Plusbtn.click();
	  
  }
}
