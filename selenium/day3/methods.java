import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		
		wb.get("http://www.facebook.com");
		
		wb.navigate().back();
		wb.navigate().forward();
		wb.navigate().refresh();
		wb.navigate().to("url");
	}
}
