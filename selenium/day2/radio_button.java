
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {
	
		public static void main(String a[]) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver wb=new ChromeDriver();
			
			wb.get("https://www.facebook.com/");
			/////////////////radio button//////////////////////
			//List rb=wb.findElements(By.name("sex"));
			//((WebElement) rb.get(0)).click();
			
			
			//////////////////check box//////////////////
			boolean fs=true;
			List cb=wb.findElements(By.name(""));
			boolean cs=((WebElement)cb.get(0)).isSelected();
			if(cs==false) {
					if(fs==true)
						wb.findElement(By.name("")).click();
				}
			else {
				if(fs==false)
					wb.findElement(By.name("")).click();
			}
}
}