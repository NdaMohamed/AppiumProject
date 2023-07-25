package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	String validusername= "standard_user";
	String validpsw= "secret_sauce";
	String invalidusername= "gjhfgjhdfvhv";
	String invalidpsw= "kgjmklfdngjbbd";
	
	//Leave all fields empty and Click on login btn error msg should appears to prevent it
	@Test(priority = 1)
	public void CheckLeaveinputsEmpty()
	{
		loginPage.ClickOnloginbtn();
		Assert.assertEquals(loginPage.GetErrorMsgtxt(),"Username is required");
	}
	//fill psw only as empty and Click on login btn error msg should appears to prevent it
	@Test(priority = 2)
	public void CheckLeaveUserNameEmpty()
	{
		loginPage.SetuserName("");
		loginPage.Setpsw(validpsw);
		loginPage.ClickOnloginbtn();
		Assert.assertEquals(loginPage.GetErrorMsgtxt(),"Username is required");
	}
	@Test(priority = 3)
	public void CheckLeavePasswordEmpty()
	{
		loginPage.SetuserName(validusername);
		loginPage.Setpsw("");
		loginPage.ClickOnloginbtn();
		Assert.assertEquals(loginPage.GetErrorMsgtxt(),"Password is required");
	}
	@Test(priority = 4)
	public void CheckInvalidUserName()
	{
		loginPage.SetuserName("test");
		loginPage.Setpsw(validpsw);
		loginPage.ClickOnloginbtn();
		Assert.assertEquals(loginPage.GetErrorMsgtxt(),"Username and password do not match any user in this service.");
		
	}
	@Test(priority = 5)
	public void CheckInvalidPassword()
	{
		loginPage.SetuserName(validusername);
		loginPage.Setpsw("testpsw");
		loginPage.ClickOnloginbtn();
		Assert.assertEquals(loginPage.GetErrorMsgtxt(),"Username and password do not match any user in this service.");
	}
	
	
	@Test(priority = 6)
	public void CheckSuccessLogin() throws InterruptedException {

		loginPage.SetuserName(validusername);
		loginPage.Setpsw(validpsw);
		loginPage.ClickOnloginbtn();
		Assert.assertTrue(loginPage.GetAppTitleElement());
		Assert.assertEquals(loginPage.GetAppTitletxt(),"PRODUCTS");
	}
}
