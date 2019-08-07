package day06082019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.fb_home_page;
import pages.fb_login_page;
public class pom {
	 WebDriver dr;	
	  fb_login_page loginpage;
	  fb_home_page homepage;
	  @Test(priority=0)
	  public void test_login_page() {
	 loginpage=new fb_login_page(dr);
	 String login_page_title=loginpage.get_title();
	 System.out.println("Title: "+login_page_title);
	 Assert.assertTrue(login_page_title.contains("Facebook"));
	  }
	  @BeforeClass
	  public void launchBrowser() {
	 System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	dr=new ChromeDriver();
	dr.get("https://www.facebook.com");
	  }
	  @Test(priority=2)
	  public void test_homepage()
	  {
	 loginpage.do_login("","");
	 homepage=new fb_home_page(dr);
	 String actual_pn=homepage.get_profilename();
	 System.out.println("Actual Profile Name: "+actual_pn);
	 Assert.assertTrue(actual_pn.contains("Shilpy"));
	  }


}
