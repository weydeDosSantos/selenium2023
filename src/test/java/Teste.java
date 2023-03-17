import org.junit.Test;
import org.openqa.selenium.By;

public class Teste  {

	Metodos m = new Metodos();
	
	@Test
	public void testeCadastro() throws InterruptedException {
		m.navegador();
		m.scroll(By.xpath("//span[contains(text(),'Strategy, Design e Delivery para a solução de problemas complexos')]"));
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//WebElement element = driver.findElement((By.xpath("//span[contains(text(),'Strategy, Design e Delivery para a solução de problemas complexos')]")));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(500);
		//Assert.assertEquals("Strategy, Design e 
}
}

	
