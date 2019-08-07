package day15082019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class web_element_function {
	 static WebDriver dr;
	 public static void launchBrowser(String url)
	 {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 dr=new ChromeDriver();
		 dr.get(url);
		 System.out.println("1");
	 }
	 public static void enterText(String path,String text)
	 {
		 dr.findElement(By.xpath(path)).sendKeys(text);
		 System.out.println("2");
	 }
	 public static void clickButton(String path)
	 {

		 dr.findElement(By.xpath(path)).click();
		 System.out.println("3");
	 }

	 public static String verify(String path,String ev)
	 {
		 String ar=dr.findElement(By.xpath(path)).getText() ;
		 System.out.println(ar);
		 Assert.assertEquals(ar,ev);
		 System.out.println("4");
		 return ar;
	 }
	 public static void clickLink(String path) {
	 // TODO Auto-generated method stub
		 dr.findElement(By.xpath(path)).click();
		 System.out.println("5");
	 }
	 



}
