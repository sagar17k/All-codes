package objectrepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHome {
	
	WebDriver driver;
	
	public RediffHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By search = By.id("srchquery_tbox");
	By click = By.xpath("/html/body/div[5]/div/form/input[2]");*/
	
	@FindBy(id="srchquery_tbox")
	WebElement search;
	
	@FindBy(xpath="/html/body/div[5]/div/form/input[2]")
	WebElement click;
	
	public WebElement srch()
	{
		
		return search;
	}

	public WebElement clk()
	{
		
		return click;
	}
}
