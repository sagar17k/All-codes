import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://the-internet.herokuapp.com/windows");
		w.findElement(By.linkText("Click Here")).click();
		Set<String> s = w.getWindowHandles();
		Iterator<String> it = s.iterator();
		String p = it.next();
		String c = it.next();
		String a = w.switchTo().window(c).findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(a);
		String b = w.switchTo().window(p).findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		System.out.println(b);

	}

}
