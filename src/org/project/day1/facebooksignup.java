package org.project.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class facebooksignup extends basefacebook {
	public static void main(String[] args) throws Throwable  {
		webdriverinit();
		loadurl("url");
		WebElement w=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fill(w, "Midlands");
		WebElement w1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fill(w1, "Blackburn");
		WebElement w2=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		fill(w2, "7397358504");
		WebElement w3=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		fill(w3, "Lancashire@PR13TE");
		takeshot();
		timedelay();
		quito();

	}

}
