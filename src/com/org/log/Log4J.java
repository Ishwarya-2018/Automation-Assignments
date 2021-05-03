package com.org.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4J {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		WebDriver driver = new ChromeDriver();
		Logger log = Logger.getLogger("devpinoyLogger");

		driver.get("http://healthunify.com/bmicalculator/");
		log.debug("opening webiste");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.debug("entring weight");
		driver.findElement(By.name("wg")).sendKeys("87");
		log.debug("selecting kilograms");
		driver.findElement(By.name("opt1")).sendKeys("kilograms");
		log.debug("selecting height in feet");
		driver.findElement(By.name("opt2")).sendKeys("5");
		log.debug("selecting height in inchs");
		driver.findElement(By.name("opt3")).sendKeys("10");
		log.debug("Click");
	}

}
