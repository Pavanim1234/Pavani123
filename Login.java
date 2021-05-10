package pages;

import org.openqa.selenium.By;



import utility.*;

public class Login extends Baseclass {
	public static void loginapp(String un,String pw)throws Exception {
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("Login completed");
	}

}
