package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_home_page {
	WebDriver dr;
	By profile_xp=By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span");

	public fb_home_page(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr=dr;
	}

	public String get_profilename() {
		// TODO Auto-generated method stub
		return dr.findElement(profile_xp).getText();
	}

}
