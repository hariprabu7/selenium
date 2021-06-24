package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {
	
	//Re-usable Functions
	public void openapp() {
			System.setProperty("webdriver.chrome.driver", "E:\\Testing_Software\\Java\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("APP OPENED");	
			Log.info("App Opened");
		}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Log.info("Login Success");
	}
	public void logout() {
		driver.findElement(By.linkText(btn_logout)).click();
		Log.info("Logout Success");
	}
	public void closeapp() {
		driver.close();
		System.out.println("APP CLOSED");
		Log.info("App Closed");
	}
	public void addemp() {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_firstname)).sendKeys(fn);
		driver.findElement(By.name(txt_lastname)).sendKeys(fn);
		driver.findElement(By.xpath(btn_save)).click();
		System.out.println("Emp ADDED");
		driver.switchTo().defaultContent();
		Log.info("Emp Added");
	}
	public void leave() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText(mo_leave))).perform();
		act.moveToElement(driver.findElement(By.linkText(mo_leavesummary))).perform();
		driver.findElement(By.linkText(btn_empleavesummary)).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(btn_view)).click();
		driver.switchTo().defaultContent();
		Log.info("Leave Completed");
	}
	public void empinfo() {
		driver.switchTo().frame("rightMenu");
		Select drop = new Select(driver.findElement(By.name(drop_search)));
		drop.selectByValue(drop_empid);
		driver.findElement(By.name("loc_name")).sendKeys(searchfor);
		driver.findElement(By.xpath(btn_search)).click();
		driver.switchTo().defaultContent();
		Log.info("Empinfo Completed");
	}

}
