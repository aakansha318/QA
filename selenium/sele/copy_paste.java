package sele;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class copy_paste {
	static Logger log;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		
		wb.get("http://www.facebook.com");
		WebElement w1=wb.findElement(By.xpath("//input[@name='email']"));
		WebElement w2=wb.findElement(By.xpath("//input[@name='pass']"));
		WebElement w3=wb.findElement(By.xpath("//input[@name='firstname']"));
		WebElement w4=wb.findElement(By.xpath("//input[@name='lastname']"));
		Actions act=new Actions(wb);
		//hover over electronics
		log=Logger.getLogger("devpinoyLogger");
		Action a=act.moveToElement(w3)
				.click(w3)
				.sendKeys("java")
				.keyDown(w3,Keys.CONTROL)
				.sendKeys("A")
				.sendKeys("x")
				.keyUp(w3,Keys.CONTROL)
				.build();
				
		a.perform();
		Actions act1=new Actions(wb);
		Action b=act1.moveToElement(w1)
				.click(w1)
				.keyDown(w1,Keys.CONTROL)
				.sendKeys("v")
				.keyUp(w1,Keys.CONTROL)
				.build();
				
		b.perform();
		log.info("executed");
		wb.close();
				
	}

}
