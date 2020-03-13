import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		
		w.get("http://gmail.com");
		w.findElement(By.linkText("Help")).click();
	Set<String> id = w.getWindowHandles();
	Iterator<String> it = id.iterator();
	String p = it.next();
	String c = it.next();
	w.switchTo().window(p);
	System.out.println(w.getTitle());
	
	

	}

}
