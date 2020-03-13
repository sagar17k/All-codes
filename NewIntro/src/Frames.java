import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://jqueryui.com/droppable/");
		//WebElement ifr = w.findElement(By.tagName("iframe")).getSize();
		//System.out.println(w.findElements(By.tagName("iframe")).size());
		w.switchTo().frame()	
		w.switchTo().frame(w.findElement(By.className("demo-frame"))).findElement(By.xpath("//div[@id='draggable'] //p[text()='Drag me to my target']")).click();
		WebElement source = w.findElement(By.id("draggable"));
		WebElement target = w.findElement(By.id("droppable"));
		Actions a = new Actions(w);
		a.dragAndDrop(source, target).build().perform();
		w.switchTo().defaultContent();
		

}
}
