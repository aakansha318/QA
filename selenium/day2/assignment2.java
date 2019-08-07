import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {
	public static void main(String a[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver wb=new ChromeDriver();
				
				wb.get("http://examples.codecharge.com/Store/Default.php");
				
				String title="Online Bookstore";
				
				String t=wb.getTitle();
				
				if(title.equalsIgnoreCase(t))
					System.out.println("Pass");
				///Dropdown////
				 WebElement we=wb.findElement(By.name("category_id")); 
				 Select s1=new Select(we);
				 s1.selectByVisibleText("Databases");
				 wb.findElement(By.name("DoSearch")).click();
				 wb.close();				
	}			

}
