	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Autosuggg {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagakada\\Desktop\\chromedriver.exe");
			WebDriver w = new ChromeDriver();
			w.manage().window().maximize();
			w.get("https://ksrtc.in/oprs-web/");
			//w.findElement(By.id("fromPlaceName")).sendKeys(Keys.chord("BENG", Keys.DOWN));
			w.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Beng");
			w.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			w.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			String s = w.findElement(By.xpath("//input[@id='fromPlaceName']")).getText();
			System.out.println(s);
			int i = 0;
			JavascriptExecutor js = (JavascriptExecutor) w;
			String script = " return document.getElementById(\"fromPlaceName\").value;";
		    String text = 	(String) js.executeScript(script);
		    while(!text.equalsIgnoreCase("BENGALURU AIRPORT"))
		    {
		    	i++;
				text = 	(String) js.executeScript(script);
		    	w.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		    	System.out.println(text);
		    	if(i<10)
		    	{
		    		break;
		    	}
		    	
		    	    	
		    } 
		    
		    
			
			

		}

	}



