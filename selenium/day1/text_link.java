import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_link {
	public static void main(String a[]) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver wb=new ChromeDriver();
		
		wb.get("https://www.facebook.com/");
		
		//wb.findElement(By.linkText("Forgotten account?")).click();
		//wb.findElement(By.partialLinkText("Forgot")).click();
		
		//wb.findElement(By.cssSelector("div._5iyx")).click();
		//wb.findElement(By.cssSelector("input[type='submit']")).click();
		
		//wb.findElement(By.xpath("//input[@id='email']"));
		//wb.findElement(By.xpath("//label[@for='u_0_7']"));
		
		System.out.println(wb.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText());
	}

}
