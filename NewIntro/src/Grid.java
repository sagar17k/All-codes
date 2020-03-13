import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.cricbuzz.com/live-cricket-scorecard/22780/nz-vs-ind-3rd-odi-india-tour-of-new-zealand-2020");
		WebElement table = w.findElement(By.cssSelector("div[class ='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int el = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i = 0 ; i<el-2 ; i++) {
			
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
				
		}
		}
		
}