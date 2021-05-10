package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testngexample {
	private static WebDriver driver;
	@BeforeClass
	public void start() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\PavaniMuchumari\\Desktop\\Drivers\\msedgedriver.exe");
		 driver=new EdgeDriver();
		
		}
	@Test
	public void login()throws Exception {
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		System.out.println("Application opened");
		driver.findElement(By.name("email")).sendKeys("9121157905");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Pavani@806");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("Login completed");
		Thread.sleep(1500);
		WebElement w=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(w).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(1500);
		System.out.println("Logout completed");

	}
	@AfterClass
	public static void stop() {
		driver.close();
		System.out.println("Application closed");
	}
	
	
	

}
