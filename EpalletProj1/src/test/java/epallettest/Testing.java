package epallettest;

import org.testng.annotations.Test;
import epallettest.LoginPage;
import epallettest.MyAccountPage;
import epallettest.PDPPage;
import epallettest.PlaceOrder;

public class Testing {
  @Test
  public void testing() {
	  LoginPage.login();
	  MyAccountPage.myaccount();
	  PDPPage.PDP();
	  PlaceOrder.placeorder();
  }
}
