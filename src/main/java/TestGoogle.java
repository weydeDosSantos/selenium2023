import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle{
	
	
		@Test
		public void testeCadastro() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver.get("https://www.verity.com.br/");
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			//scroll();
			//WebElement element = driver.findElement((By.xpath("//span[contains(text(),'Strategy, Design e Delivery para a solução de problemas complexos')]")));
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			//Thread.sleep(500);
			//Assert.assertEquals("Strategy, Design e Delivery para a solução de problemas complexos", texto);
			
			
	}
}
