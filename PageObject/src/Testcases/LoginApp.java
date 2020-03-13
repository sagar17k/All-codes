package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepo.RediffHome;
import objectrepo.RediffLogin;

public class LoginApp {
	
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLogin rd =new RediffLogin(driver);
		rd.userName().sendKeys("HALOOO");
		rd.passWrd().sendKeys("hiiiiiiiiiiiiiii");
		//rd.submit().click();
		rd.home().click();
		Thread.sleep(2000);
		RediffHome rh = new RediffHome(driver);
		rh.srch().sendKeys("Modi");
		rh.clk().click();
		
		
	}

}