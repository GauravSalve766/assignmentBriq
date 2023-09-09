package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public void initialisation() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
//		driver.manage().timeouts().implicitlyWait(30);
		
	}
}
