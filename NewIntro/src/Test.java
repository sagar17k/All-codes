import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w = new ChromeDriver();
	w.get("https://www.spicejet.com/");
	w.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	w.findElement(By.cssSelector("a[value='GOI']")).click();
	Thread.sleep(2000);
	w.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	//w.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

}
}
