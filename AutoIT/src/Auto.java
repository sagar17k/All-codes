import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	
	public static void main(String...args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.quit();*/
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\alahiri\\fileupld.exe");
		
	}
	

}
