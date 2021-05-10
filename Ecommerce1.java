
package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ecommerce1{
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.edge.driver","C:\\Users\\PavaniMuchumari\\Desktop\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		System.out.println("Application opened");
		driver.findElement(By.name("email")).sendKeys("9121157905");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Pavani@806");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement w=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(w).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
		
			}


}

