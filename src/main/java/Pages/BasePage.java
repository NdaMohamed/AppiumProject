package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public By waitForElement(By element) {
	            try {
	            	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            	
	            	
	            	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	                return element;
	            } catch (Exception e) {
	                System.out.println("Can not locate elemnet"+element);
	            }
	            return element;
	}
	
	public WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	public String GetText(By locator) {return driver.findElement(locator).getText();};

	public By getElementByText(Thread className,String text)
	{
	return	By.xpath("//'"+className+"'[contains(@content-desc,'"+text+"']");
	}
	public void ClickOnElement(By element) {driver.findElement(element).click();}
	public void SetText(By element,String txt) {
		driver.findElement(element).sendKeys(txt);
	}
}
