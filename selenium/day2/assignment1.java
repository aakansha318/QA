import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
	public static void main(String a[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver wb=new ChromeDriver();
				
				wb.get("https://demowebshop.tricentis.com/");
				
				String title="Demo Web Shop";
				
				String t=wb.getTitle();
				
				if(title.equalsIgnoreCase(t))
					System.out.println("Pass");
				
				wb.findElement(By.className("ico-register")).click();
				
				List rb=wb.findElements(By.name("Gender"));
				((WebElement) rb.get(0)).click();
				wb.findElement(By.id("FirstName")).sendKeys("Sample");
				wb.findElement(By.id("LastName")).sendKeys("Kumar");
				wb.findElement(By.id("Email")).sendKeys("aakansha.dhawan@globallogic.com");
				wb.findElement(By.id("Password")).sendKeys("pass123$");
				wb.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
				wb.findElement(By.id("register-button")).click();
				
				wb.findElement(By.className("ico-logout")).click();
				
				wb.close();
	}

}
