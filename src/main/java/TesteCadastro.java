import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCadastro {

	@Test
	public void testeCadastro() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("magico");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("jhonson");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
		combo.selectByVisibleText("1o grau incompleto");
		element = driver.findElement(By.id("elementosForm:esportes"));
		combo = new Select(element);
		combo.selectByVisibleText("Futebol");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Assert.assertEquals("Cadastrado!", driver.findElement(By.xpath("//div[@id=\"resultado\"]/span")).getText());
		Assert.assertEquals("Nome: magico", driver.findElement(By.id("descNome")).getText());
		Assert.assertEquals("Nome: magico", driver.findElement(By.id("descNome")).getText());
		
		
		driver.quit();
	}
}