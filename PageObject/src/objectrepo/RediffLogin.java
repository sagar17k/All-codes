package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin {
	
	WebDriver driver;
    By name =By.xpath("//*[@id=\"login1\"]");
    By passwd =By.name("passwd"); 
    By go =By.name("proceed");
    By home = By.linkText("Home");
    
    public RediffLogin(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public WebElement userName()
    {
    	return driver.findElement(name);
    }
    
    public WebElement passWrd()
    {
    	
    	return driver.findElement(passwd);
    }
    
    public WebElement submit()
    {
    	
    	return driver.findElement(go);
    }
    
    public WebElement home()
    {
    	
    	return driver.findElement(home);
    }

}
