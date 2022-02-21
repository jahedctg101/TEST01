package BaseMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Daraz {
	public static WebDriver browser;
	//browser SetUp:
	public static void browser_SetUP(String br) {
		
		if(br.equalsIgnoreCase("chrome")) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Batch2021-JUNE-SDET\\JAVA\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		browser = new ChromeDriver(option);
		}
		else if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			browser = new FirefoxDriver();			
		}
		else if (br.equalsIgnoreCase("internetexplorer")) {
//			System.setProperty("webdriver.ie.driver", "");
			WebDriverManager.iedriver().setup();
			browser = new InternetExplorerDriver();
		}
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}//browserSetUp
	
	public static void url_Daraz(String url) {
		browser.get(url);
	}
	public static boolean isDisplayed(String xPath) {
		WebElement logo=browser.findElement(By.xpath(xPath));
		return logo.isDisplayed();
	}
	
	
}
