package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterPage extends CommonPage {

	public WebElement text;
	public WebElement password;
	public WebElement textarea;
	public WebElement hidden;
	public WebElement radio;
	public WebElement radio1;
	public WebElement radio2;
	public WebElement radio3;
	public WebElement checkbox1;
	public WebElement checkbox2;
	public WebElement select;
	public List<WebElement> options;
	public WebElement date;
	public WebElement file;
	public WebElement button;
	public WebElement back;
	public WebElement submit;
	public String alertMessage;

	public EnterPage(WebDriver driver) {
		super(driver, "http://selenium/add.html");
		this.text = this.driver.findElement(By.id("text"));
		this.password = this.driver.findElement(By.id("password"));
		this.textarea = this.driver.findElement(By.id("textarea"));
		this.hidden = this.driver.findElement(By.id("hidden"));
		this.radio1 = this.driver.findElement(By.id("radio1"));
		this.radio2 = this.driver.findElement(By.id("radio2"));
		this.radio3 = this.driver.findElement(By.id("radio3"));
		this.checkbox1 = this.driver.findElement(By.id("checkbox1"));
		this.checkbox2 = this.driver.findElement(By.id("checkbox2"));
		this.select = this.driver.findElement(By.id("select"));
		this.options = this.driver.findElements(By.cssSelector("select > option"));
		this.date = this.driver.findElement(By.id("date"));
		this.file = this.driver.findElement(By.id("file"));
		this.button = this.driver.findElement(By.id("button"));
		this.submit = this.driver.findElement(By.cssSelector("input[type='submit']"));
	}
	
	public void validateRequiredFields() {
		this.submit.click();
		errorMessages.add(this.driver.findElement(By.id("text-error")));
		errorMessages.add(this.driver.findElement(By.id("textarea-error")));
	}

	public void handleAlert() {
		this.button.click();
		this.alertMessage = this.driver.switchTo().alert().getText();
		this.driver.switchTo().alert().accept();
	}
	
	public void enterAnInformation() {
		this.text.sendKeys("text");
		this.password.sendKeys("password");
		this.textarea.sendKeys("textarea");
		driver.executeScript("document.getElementById('hidden').value = 'hidden';");
		this.radio2.click();
		this.checkbox1.click();
		this.checkbox2.click();
		this.options.get(3).click();
		this.date.sendKeys("2015/1/1");
		this.file.sendKeys("/resources/sample.txt");
		this.submit.click();

		this.text = this.driver.findElement(By.id("text"));
		this.password = this.driver.findElement(By.id("password"));
		this.textarea = this.driver.findElement(By.id("textarea"));
		this.hidden = this.driver.findElement(By.id("hidden"));
		this.radio = this.driver.findElement(By.id("radio"));
		this.checkbox1 = this.driver.findElement(By.id("checkbox1"));
		this.checkbox2 = this.driver.findElement(By.id("checkbox2"));
		this.options = this.driver.findElements(By.cssSelector("ul > li"));
		this.date = this.driver.findElement(By.id("date"));
		this.file = this.driver.findElement(By.id("file"));
		this.back = this.driver.findElement(By.id("back"));
		this.submit = this.driver.findElement(By.cssSelector("input[type='submit']"));
	}
}
