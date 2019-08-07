import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	public static void main(String a[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver wb=new ChromeDriver();
				
				wb.get("https://demowebshop.tricentis.com/");
				
				wb.findElement(By.className("ico-login")).click();
				wb.findElement(By.xpath("//input[@name='Email']")).sendKeys("aakansha.dhawan@globallogic.com");
				wb.findElement(By.xpath("//input[@name='Password']")).sendKeys("pass123$");
				wb.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
				String email=wb.findElement(By.xpath("//a[@class='account']")).getText();
				if(email.equals("aakansha.dhawan@globallogic.com")) {
					System.out.print("valid");
				}
				wb.findElement(By.className("ico-logout")).click();
				
				wb.close();
	}
}
