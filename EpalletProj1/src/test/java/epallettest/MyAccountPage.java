package epallettest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MyAccountPage {
	
  @Test
  public static void myaccount() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\zaytona\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://customer-staging.epallet.com/");
	  WebElement Signin=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/a[1]/button"));
	  Signin.click();
	  try {
		Thread.sleep(2000);
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
	  //start here
	  WebElement AccountInfo=driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[2]/div/div[2]/div/div[3]/ul/li[1]/a"));
	  AccountInfo.click();
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  WebElement Dashboard=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/div/div/aside/div/ul/li[1]/span"));
	  Dashboard.click();
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement CompanyName=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/section/main/div/div/div[2]/div[1]/div/form/div/div[1]/span/span/input"));
	 Assert.assertEquals(CompanyName.getAttribute("value").toString(), "QaITGqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
	 WebElement EmailFeild=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/section/main/div/div/div[2]/div[1]/div/form/div/div[2]/span/span/input"));
	 Assert.assertEquals(EmailFeild.getAttribute("value").toString(), "qa.itg6.2021@gmail.com");
	 WebElement ConcatName=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/section/main/div/div/div[2]/div[1]/div/form/div/div[3]/span/span/input"));
	 Assert.assertEquals(ConcatName.getAttribute("value").toString(), "Qa");
	 WebElement Phone=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/section/main/div/div/div[2]/div[1]/div/form/div/div[4]/span/span/input"));
	 Assert.assertEquals(Phone.getAttribute("value").toString(), "Tesy");
  }
  @BeforeTest
  public void beforeTest() {

  }

}
