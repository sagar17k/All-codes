import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.spicejet.com/");
		w.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		w.findElement(By.cssSelector("a[value='GOI']")).click();
		//w.findElement(By.id("id='ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		w.findElement(By.xpath("//a[@value='DEL']")).click();
		w.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//System.out.println(w.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		//w.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(w.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		
		System.out.println("Enabled");

	}
		else
		{
			System.out.println("false");
		}

}
}