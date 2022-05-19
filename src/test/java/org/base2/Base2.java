package org.base2;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base2 {
public static WebDriver driver;
	
	public static void browserLaunch(String url) {
			
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	}
	
	public static void fireFox(String url) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	public static WebElement findelementId(String id) {
	
		WebElement findelement = driver.findElement(By.id(id));
		return findelement;
	}
	public static WebElement xpath(String i) {
		WebElement webElement = driver.findElement(By.xpath(i));
		return webElement;
		}
	public static WebElement findelementName(String q) {
		WebElement ele = driver.findElement(By.className(q));
		return ele;
	}
	
	public static WebElement name(String a) {
	WebElement findElement = driver.findElement(By.name(a));
	return findElement;
	}
	public static void sendkeys(WebElement e,String data) {
	e.sendKeys(data);
	}
	public static String getAtrribute(WebElement a) {
		String attribute = a.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	public static void btn(String id) {
	WebElement element = driver.findElement(By.id(id));
	element.click();
	}
	public static void click(WebElement c) {
		c.click();

	}
	
	public static String getText(WebElement u) {
//	WebElement findElement = driver.findElement(By.xpath(value));
		String text = u.getText();
		System.out.println(text);
		return text;
	}

	public static void mouseOver(WebElement k) {
		Actions actions = new Actions(driver);
		actions.moveToElement(k).perform();
	}
	
	public static void dropDown(WebElement l,WebElement p) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(l, p).perform();
	}
	public static void rightClick(WebElement f) {
	Actions actions = new Actions(driver);
	actions.contextClick(f).perform();
	}
	public static void keyboadActions(WebElement h,int input) throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(input);
		
		}
	
	public static void actionsKeys(WebElement m,Keys shift,String h,Keys shift2) {
		Actions action = new Actions(driver);
		action.keyDown(shift).sendKeys(h).keyUp(shift2).perform();

	}
	public static void doubleClick(WebElement j) {
	Actions actions  = new Actions(driver);
	actions.doubleClick(j).perform();
	
	}
	public Alert alert(WebElement g) {
		
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public void navigate(String w) {
		WebDriverManager.chromedriver().setup();
		
		driver.navigate().to(w);

	}

	public void backNavigate() {
		driver.navigate().back();
	}
	
	public void forwardNavigate() {
		driver.navigate().forward();

	}
	
	public File takeScreenShot(String Pathname) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(Pathname);
		FileUtils.copyFile(screenshotAs, destination);
		return screenshotAs;
	}
	
	public static void select(WebElement f,String h) {
		Select select = new Select(f);
		select.selectByVisibleText(h);
		
	}
	






}




