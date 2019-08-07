package day06082019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	By uname=By.xpath("//*[@id=\"email\"]");
	By pwd=By.xpath("//*[@id=\"pass\"]");
	By btn=By.xpath("//*[@id=\"loginbutton\"]");
	By recent=By.xpath("//*[@id=\"u_0_j\"]/div");
	By recent_login_pwd=By.xpath("//*[@id=\"pass\"]");

	WebDriver dr;
	public void fb_login_page(WebDriver dr)
	{
		this.dr=dr;
	}
	public void set_uname(String un)
	{
		dr.findElement(uname).sendKeys(un);
	}
	public void set_pwd(String pword)
	{
		dr.findElement(pwd).sendKeys(pword);
	}
	public void clk_btn()
	{
		dr.findElement(btn).click();
	}
	public void do_login(String u,String p)
	{
		this.set_uname(u);
		this.set_pwd(p);
		this.clk_btn();
	}
	public String get_title()
	{
		return dr.getTitle();
	}
}
