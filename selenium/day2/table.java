import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String a[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver wb=new ChromeDriver();
				
				wb.get("https://w3schools.com/html/html_tables.asp");
				int r=2,c=3;
				String xp="//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]";
				String data= wb.findElement(By.xpath(xp)).getText();
				for(r=2;r<=7;r++) {
					for(c=1;c<=3;c++) {
						 xp="//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]";
						 data=wb.findElement(By.xpath(xp)).getText();
						 System.out.print(data+" ");
					}
					System.out.println();
				}
				wb.close();
	}
}
