package selenium.mavenproject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class demo3Test
	{
		public static void main(String[] args) throws InterruptedException {
			
			//WebDriver driver = (WebDriver) new FirefoxDriver();
			WebDriver driver = (WebDriver) new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://www.faceook.com");
			Thread.sleep(3000);
			
			

	}

}
