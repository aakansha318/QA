import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie_driver {
	public static void main(String a[]) {
		System.setProperty("webdriver.ie.driver", "D:\\drivers\\IEDriverServer.exe");
		
		WebDriver wb=new  InternetExplorerDriver();
		wb.get("https://www.facebook.com/");
	}

}
