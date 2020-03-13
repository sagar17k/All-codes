import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	/*d.get("http://facebook.com");
	d.findElement(By.cssSelector("input[type='email']")).sendKeys("8551801742");
	d.findElement(By.cssSelector("input[id='pass']")).sendKeys("saggubaby1795");
	d.findElement(By.cssSelector("input[value='Log In']")).click();
	d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Arpita is an asshole");*/
	
	d.get("https://www.google.com/");
	Actions a = new Actions(d);
	a.sendKeys(Keys.F12).perform();;
	//d.findElement(By.className("input.r4.wide.mb16.mt8.username")).sendKeys("ksnanma");	}

}}