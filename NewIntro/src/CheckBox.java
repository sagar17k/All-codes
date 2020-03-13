import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver w = new ChromeDriver();
			w.get("https://www.spicejet.com/");
			Assert.assertFalse(w.findElement(By.cssSelector("input[id*='chk_friendsandfamily")).isSelected());
			//System.out.println(w.findElement(By.cssSelector("input[id*='chk_friendsandfamily")).isSelected());
			w.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
			//System.out.println(w.findElement(By.cssSelector("input[id*='chk_friendsandfamily")).isSelected());
			Assert.assertTrue(w.findElement(By.cssSelector("input[id*='chk_friendsandfamily")).isSelected());
			//Assert.assertEquals(w.findElements(By.cssSelector("input[type='checkbox']")).size(), "5");
			System.out.println(w.findElements(By.cssSelector("input[type='checkbox']")).size());
	

	}

}
