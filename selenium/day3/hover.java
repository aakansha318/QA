import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		
		wb.get("http://demowebshop.tricentis.com/");
		WebElement elec=wb.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
		WebElement cellphone=wb.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a"));
		Actions act=new Actions(wb);
		//hover over electronics
		Action a=act.moveToElement(elec).build();
		a.perform();
		//hover on cellphone and click on it
		Action b=act.moveToElement(cellphone).click().build();
		b.perform();
		
		wb.close();
	}
}
