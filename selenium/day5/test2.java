package day02082019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 extends BaseClasses.BaseCl{
	WebDriver dr;
	  @Test
	  public void tc1() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("http://demowebshop.tricentis.com");
	  }
	  @Test
	  public void tc2() {
		  System.out.println("in tc2");
		  String ac="shilpymishra788";
		 String ex=attempt_login("shilpymishra788","hannah",dr);
		  Assert.assertEquals(ac, ex);
	  }
	  @Test
	  public void tc3() {
		  System.out.println("in tc3");
		  String ac="shilpymishra788@gmail.com";
		  String ex=attempt_login("shilpymishra788@gmail.com","hannah",dr);
		  Assert.assertEquals(ac, ex);
	  }
}
