import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
	public static void main(String a[]){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver wb=new ChromeDriver();
		
		wb.get("https://www.facebook.com/");

		wb.findElement(By.id("email")).sendKeys("8960524600");
		wb.findElement(By.id("pass")).sendKeys("01121995");
		wb.findElement(By.id("loginbutton")).click();
		
		String pn,title=wb.getTitle();
		
		pn=wb.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
		
		System.out.println(pn+" "+title);
		
	}

}
