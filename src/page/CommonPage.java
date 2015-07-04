package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.JavaScriptExecutableEventFiringWebDriver;
import eventlistener.CustomEventListener;

public class CommonPage {

	public String url;
	public JavaScriptExecutableEventFiringWebDriver driver;
	public WebElement title;
	public WebElement keywords;
	public WebElement description;
	public List<WebElement> errorMessages;

	public CommonPage(WebDriver driver, String url) {
		this.url = url;
		this.driver = new JavaScriptExecutableEventFiringWebDriver(driver);
		CustomEventListener eventListener = new CustomEventListener();
		this.driver.register(eventListener);
		this.driver.get(url);
		this.title = this.driver.findElement(By.cssSelector("title"));
		this.keywords = this.driver.findElement(By.name("keywords"));
		this.description = this.driver.findElement(By.name("description"));
		this.errorMessages = new ArrayList<WebElement>();
	}
}
