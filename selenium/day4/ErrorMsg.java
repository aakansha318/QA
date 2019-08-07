package error;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ErrorMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		Excel2 e = new Excel2();
		Creds2 c = new Creds2();
		dr.get("http://demowebshop.tricentis.com/");
		
		
		
		for(int i = 1;i<=4;i++) {
			c= e.read_file(i);
			
			//dr.navigate().to("http://demowebshop.tricentis.com/");
			
			dr.navigate().refresh();
			
			dr.findElement(By.xpath("//a[@class='ico-login']")).click();
			
			dr.findElement(By.xpath("//input[@id='Email']")).clear();
			dr.findElement(By.xpath("//input[@id='Email']")).sendKeys(c.email);
			
			dr.findElement(By.xpath("//input[@id='Password']")).clear();
			dr.findElement(By.xpath("//input[@id='Password']")).sendKeys(c.pass);
			
			//dr.findElement(By.xpath("//input[@type='submit']")).click();
			
			String s = null;
			try {
				s = dr.findElement(By.xpath("//span[@for='Email']")).getText();
			}catch(Exception ex) {
				s = "No Error";
			}
			c.err = s;
			
			e.write_file(i, s);
			
		}
		
		

		
		dr.close();
		
	}

}
