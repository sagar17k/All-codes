import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.path2usa.com/travel-companions");
		w.findElement(By.id("travel_date")).click();
		/*while(!w.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			w.findElement(By.className("next")).click();
		}*/
	List<WebElement> dates = w.findElements(By.cssSelector(".day"));
	int count = dates.size();
	
	for(int i=0 ; i<count ; i++) {
		
		String s = w.findElements(By.className("day")).get(i).getText();
		
		if(s.equalsIgnoreCase("23"))
		{
			w.findElements(By.className("day")).get(i).click();
			break;
		}
	}

	}

}
