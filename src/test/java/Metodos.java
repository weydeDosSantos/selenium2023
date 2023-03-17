import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Metodos {

	WebDriver driver;

	public void scroll(By elemento) throws InterruptedException {
		WebElement element = driver.findElement((elemento));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}
	
	public void navegador() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.get("https://www.verity.com.br/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}