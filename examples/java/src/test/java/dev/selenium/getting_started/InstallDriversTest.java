package dev.selenium.getting_started;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstallDriversTest {
	@Test
	@Disabled("Do not run in CI")
	public void chromeSession() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.quit();
	}

	@Test
	@Disabled("Do not run in CI")
	public void edgeSession() {
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.quit();
	}

	@Test
	@Disabled("Do not run in CI")
	public void firefoxSession() {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.quit();
	}

	@Test
	@Disabled("Do not run in CI")
	public void ieSession() {
		WebDriverManager.iedriver().setup();

		WebDriver driver = new InternetExplorerDriver();

		driver.quit();
	}
}
