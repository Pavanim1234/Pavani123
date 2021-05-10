package utility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public static  WebDriver driver;
	public static void openapp() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\PavaniMuchumari\\Desktop\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		System.out.println("Application opened");
		
	}	
	public static void closeapp() {
	driver.close();
	System.out.println("Application closed");
	}

}
