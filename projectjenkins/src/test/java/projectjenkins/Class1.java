package projectjenkins;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	@Test
	public void getpageTitleOfFb() throws Exception {
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		if(driver.getTitle().contains("facebook")) {
			System.out.println("Browser opened..!");
		}
		else {
			System.out.println("Browser not opened..!");
		}
			
		Thread.sleep(2000);
		driver.close();
	}
	

		
	
}
