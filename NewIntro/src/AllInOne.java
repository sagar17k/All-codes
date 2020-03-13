import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllInOne {
	
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		RemoteWebDriver w = new ChromeDriver();
		w.get("https://login.salesforce.com/?locale=in");
		//w.get("http://facebook.com");
		w.findElement(By.id("username")).sendKeys("Hello");
		//w.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("user");
		w.findElement(By.cssSelector("#password")).sendKeys("Hello");//custom css id
		//w.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("hello");; //custom css classname
		//w.findElement(By.cssSelector("input[id='password']")).sendKeys("hello");// custome css with tagname
		w.findElement(By.id("Login")).click();
		System.out.println(w.findElement(By.cssSelector("div.loginError")).getText());
		//w.findElement(By.xpath("//*[text() = 'Sign Up']")).click();
		
		
		
		
	}

}
