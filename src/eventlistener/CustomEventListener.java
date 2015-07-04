package eventlistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class CustomEventListener extends AbstractWebDriverEventListener {

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println(element.getAttribute("value"));
	}
}
