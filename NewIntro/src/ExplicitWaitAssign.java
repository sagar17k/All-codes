import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		w.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		WebDriverWait wt = new WebDriverWait(w, 5);
		wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));
		
		String s = w.findElement(By.id("results")).getText();
		System.out.println(s);
		

	}

}
