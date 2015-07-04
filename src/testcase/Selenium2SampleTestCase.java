package testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.EnterPage;

public class Selenium2SampleTestCase {
	
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		this.driver.close();
	}

	@Test
	public void testTitleKeywordAndDescription() {
		EnterPage page = new EnterPage(this.driver);
		assertEquals("Selenium2 Sample", page.title.getAttribute("text"));
		assertEquals("Selenium2,Test", page.keywords.getAttribute("content"));
		assertEquals("This page is for automated testing using Selenium2.", page.description.getAttribute("content"));
	}

	@Test
	public void testValidateRequiredFields() {
		EnterPage page = new EnterPage(this.driver);
		page.validateRequiredFields();
		assertEquals("1", page.errorMessages.get(0).getAttribute("value"));
		assertEquals("1", page.errorMessages.get(1).getAttribute("value"));
	}

	@Test
	public void testValidateTabIndex() {
		EnterPage page = new EnterPage(this.driver);
		assertEquals("1", page.text.getAttribute("tabindex"));
		assertEquals("2", page.password.getAttribute("tabindex"));
		assertEquals("3", page.textarea.getAttribute("tabindex"));
		assertEquals("4", page.radio1.getAttribute("tabindex"));
		assertEquals("4", page.radio2.getAttribute("tabindex"));
		assertEquals("4", page.radio3.getAttribute("tabindex"));
		assertEquals("5", page.checkbox1.getAttribute("tabindex"));
		assertEquals("6", page.checkbox2.getAttribute("tabindex"));
		assertEquals("7", page.select.getAttribute("tabindex"));
		assertEquals("8", page.date.getAttribute("tabindex"));
		assertEquals("9", page.file.getAttribute("tabindex"));
		assertEquals("10", page.button.getAttribute("tabindex"));
		assertEquals("11", page.submit.getAttribute("tabindex"));
	}

	@Test
	public void testHandleAlert() {
		EnterPage page = new EnterPage(this.driver);
		page.handleAlert();
		assertEquals("Clicked button!", page.alertMessage);
	}

	@Test
	public void testEnterAnInformationAndConfirm() {
		EnterPage page = new EnterPage(this.driver);
		page.enterAnInformation();
		assertEquals("text", page.text.getAttribute("value"));
		assertEquals("password", page.password.getAttribute("value"));
		assertEquals("textarea", page.textarea.getAttribute("value"));
		assertEquals("2", page.radio.getAttribute("value"));
		assertEquals("0", page.checkbox1.getAttribute("value"));
		assertEquals("1", page.checkbox2.getAttribute("value"));
		assertEquals("3", page.options.get(0).getAttribute("value"));
		assertEquals("2015/1/1", page.date.getAttribute("value"));
		assertEquals("sample.txt", page.file.getAttribute("value"));
	}
}