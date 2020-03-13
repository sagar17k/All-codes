
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDD {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w = new ChromeDriver();
	w.get("https://www.makemytrip.com/");
	w.findElement(By.xpath("//input[@id='fromCity']")).click();
	WebElement source = w.findElement(By.xpath("//input[@placeholder='From']"));
	source.clear();
	source.sendKeys("mum");
	source.sendKeys(Keys.ARROW_DOWN);
	source.sendKeys(Keys.ENTER);
	
	WebElement dest = w.findElement(By.xpath("//input[@placeholder='To']"));
	//dest.clear();
	//Thread.sleep(1000);
	dest.sendKeys("del");
	dest.sendKeys(Keys.ARROW_DOWN);
	dest.sendKeys(Keys.ENTER);

}
}