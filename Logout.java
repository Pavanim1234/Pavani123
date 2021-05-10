package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Baseclass;

public class Logout extends Baseclass {
	public static void logoutapp() {
		WebElement w=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(w).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("Logout completed");
	}

}
