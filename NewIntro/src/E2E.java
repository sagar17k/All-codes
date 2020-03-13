import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.spicejet.com/");
		w.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		w.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		w.findElement(By.cssSelector("a[value='GOI']")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']")).click();
	    w.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
	   if(w.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
		   
		   System.out.println("One Trip");
		   
	   }else
	   {
		   
		   System.out.println("Round trip");
	   }
		
	   w.findElement(By.id("divpaxinfo")).click();
	   Select s = new Select(w.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	   s.selectByValue("4");
	WebElement wb =    w.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	wb.click();
	wb.sendKeys(Keys.ARROW_DOWN);
	wb.sendKeys(Keys.ENTER);
		
		

	}

}
