import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class SelectClassExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		/*w.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select s = new Select(w.findElement(By.id("select-demo")));
		s.selectByValue("Wednesday");
		s.selectByIndex(6);
		s.selectByVisibleText("Saturday");
		s.deselectByVisibleText("Saturday");*/
		w.get("https://www.spicejet.com/");
		/*w.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(w.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("5");
		System.out.println(w.findElement(By.id("divpaxinfo")).getText());*/ //select example
		
		/*w.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		w.findElement(By.xpath("//a[@value='BLR']")).click();
		//w.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();*/ //dynamic drop down with hardcoding using index
		
		w.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		w.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		/*Try selecting Goa*/

		
		

	}

}
