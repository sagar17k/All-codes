import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver w = new ChromeDriver();
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.com/");
		Actions a = new Actions(w);
		WebElement mv = w.findElement(By.id("nav-link-accountList"));
		a.moveToElement(w.findElement(By.id("nav-link-accountList"))).build().perform();
		
		a.moveToElement(w.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().sendKeys(Keys.SHIFT, "HELLO");
		
		a.moveToElement(mv).contextClick().build().perform();
		a.send
	}

}
