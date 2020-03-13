import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		w.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Unite");
		w.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys(Keys.ARROW_DOWN);
		w.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys(Keys.ARROW_DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) w;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("United Arab Emirates"))
		
		{
			text = (String) js.executeScript(script);
			w.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
			System.out.println(text);
			break;
		}
		
		js.executeScript("window.scrollBy(0,500)");

	}

}
