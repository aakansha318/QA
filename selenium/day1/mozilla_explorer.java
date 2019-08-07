import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class mozilla_explorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		
		WebDriver wb=new  FirefoxDriver();
		wb.get("https://www.facebook.com/");

	}

}
