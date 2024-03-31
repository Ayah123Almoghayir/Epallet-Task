package epallettest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
  @Test
  public static void login() {
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
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  WebElement websitelogo=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[1]/a/span/img"));
	  if(websitelogo.isDisplayed())
		  System.out.println("Sign in Successfully.");
	  else
		  System.out.println("Sign in Failed.");  
  }
}
