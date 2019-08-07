import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		
		wb.get("http://www.facebook.com");
		
		//wait which works after every statement i.e. a break of every 10 sec after every command
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicit wait is a conditional wait for a single statement
		WebDriverWait wt=new WebDriverWait(wb,10);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		wb.findElement(By.xpath(""));
	}

}
