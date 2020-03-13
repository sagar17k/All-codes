import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		/*String host = "localhost";
		Connection con = DriverManager.getConnection("jdbc:mysql://" +host+ ":" +3306+ "/saggu", "root", "sagar123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from empinfo where id=12");
		rs.next();
		//System.out.println(rs.getString("location"));*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alahiri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("hello");
		/*driver.findElement(By.id("pass")).sendKeys(rs.getString(3));*/

	}

}
