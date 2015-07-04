package driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class JavaScriptExecutableEventFiringWebDriver extends
		EventFiringWebDriver implements JavascriptExecutor {

	public JavaScriptExecutableEventFiringWebDriver(WebDriver driver) {
		super(driver);
	}
}
