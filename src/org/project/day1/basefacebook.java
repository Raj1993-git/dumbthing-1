package org.project.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basefacebook {
	public static WebDriver driver;
	public static WebDriver webdriverinit() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar\\Desktop\\number programs\\dumbthing-1\\driver\\chromedriver.exe");
driver=new ChromeDriver();
return driver;
	}
	public static void loadurl(String url) {
		driver.get("https://www.facebook.com/");}
	
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
		
	}

	public static void timedelay() throws Throwable {
	Thread.sleep(5000);}
	
	
	public static void quito() {
	driver.quit();}
	
	public static void takeshot() throws Throwable {
	TakesScreenshot tk=(TakesScreenshot) driver;
	File s=tk.getScreenshotAs(OutputType.FILE);
	File d=new File("C:\\Users\\Rajasekar\\Pictures\\Saved Pictures\\fb1.png");
	FileUtils.copyFile(s, d);}
}
