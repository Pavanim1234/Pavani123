package testscripts;

import org.testng.annotations.Test;



import pages.Login;
import pages.Logout;
import utility.Baseclass;

public class TC001 {
	@Test
	public void test() throws Exception {
		Baseclass.openapp();
		Login.loginapp("9121157905","Pavani@806");
		Logout.logoutapp();
		Baseclass.closeapp();
		
	}

}
