import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] veggies = { "Cucumber","Beetroot","Carrot" };
		w.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		//List itemsNeeded = Arrays.asList(veggies);
		add(w,veggies);
		w.findElement(By.cssSelector("img[alt='Cart']")).click();
		w.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		w.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(w.findElement(By.cssSelector("span.promoInfo")).getText());
		
}
	
	public static void add(WebDriver w,String[] veggies)
	{
		int j = 0;
		List<WebElement> items = w.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < items.size(); i++) {
	
			String[] format = items.get(i).getText().split("-");
			String newFormat = format[0].trim();
			List itemsNeeded = Arrays.asList(veggies);

			if (itemsNeeded.contains(newFormat)) {
				w.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;

				if (j==veggies.length) {
					break;
				}
			}

		}	

	

	}
}
