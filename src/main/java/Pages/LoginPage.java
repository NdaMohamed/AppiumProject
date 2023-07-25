package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

		public LoginPage(WebDriver driver) {
			super(driver);
		}

		
		By userNametxtbox=By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]");
		By paswtxtbox=By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]");
		By loginbtn=By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");
		By ErrorMsg=By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView");
		By AppTitle=By.xpath("//android.widget.TextView[@index=0]");
		
		public void ClickOnloginbtn() {waitForElement(loginbtn); ClickOnElement(loginbtn);};
		
		public String GetErrorMsgtxt() {waitForElement(ErrorMsg); return GetText(ErrorMsg);}
		
		public String GetAppTitletxt() {waitForElement(AppTitle); return GetText(AppTitle);}
		
		public boolean GetAppTitleElement() {
			WebElement title=getElement(AppTitle);
			if (title!=null) return true;
			return false;
		}
		
		public void ClickOnuserNametxtbox() {waitForElement(loginbtn);ClickOnElement(loginbtn);}
		
		public void SetuserName(String username) {waitForElement(userNametxtbox);
										ClickOnElement(userNametxtbox);
										SetText(userNametxtbox,username);}
		
		public void Setpsw(String psw) {waitForElement(paswtxtbox);
										ClickOnElement(paswtxtbox);
										SetText(paswtxtbox,psw);}
		
		public By getElementByText(String className,String ConDesc)
		{
		return	By.xpath("[className='"+className+"]'and [contains(text(),'"+ConDesc+"')]");
		}
		
		
		
		public By getElementBytextAndClassName(String partialtext, String className) {
			try {
			By by = By.xpath("//*[contains(@text, '" + partialtext + "')][@class='" + className + "']");
			return by;
			} catch (Exception e) {
			System.out.println("Element not found with partial text: " + partialtext + " and class name: " + className);
			return null;
			}
			}
		
		
		public By getElementByPartialContentDescriptionAndClassName(String partialContentDescription, String className) {
			try {
			By by = By.xpath("//*[contains(@content-desc, '" + partialContentDescription + "')][@class='" + className + "']");
			return by;
			} catch (Exception e) {
			System.out.println("Element not found with partial content description: " + partialContentDescription + " and class name: " + className);
			return null;
			}
			}
		
		
		
		public By getElementByContDesc(String className,String ConDesc)
		{
			By element=By.xpath ("//*className, "+className+" and contains(content-desc, "+ConDesc+")");
			System.out.print(element);
			return element;
		}
		
		
	}

