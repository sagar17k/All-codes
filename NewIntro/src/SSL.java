import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.session.CapabilitiesFilter;

public class SSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DesiredCapabilities ch = DesiredCapabilities.chrome();
		DesiredCapabilities ch = new DesiredCapabilities();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS , true);
		ChromeOptions c = new ChromeOptions();
		c.setAcceptInsecureCerts(true)
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();

	}

}
