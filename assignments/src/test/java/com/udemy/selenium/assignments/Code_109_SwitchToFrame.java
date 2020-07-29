package com.udemy.selenium.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Code_109_SwitchToFrame extends Code_109_SwitchToFrame1  {



	


	public static void main(String[] args) {

	// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jaju_v\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		


	WebDriverWait wd=new WebDriverWait(driver,7);

//	driver.get("https://google.com");
	driver.get("https://fantasycricket.dream11.com/IN/");

	driver.manage().window().maximize();

	int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));

	driver.switchTo().frame(m);

	driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

	driver.switchTo().defaultContent();

	wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

	int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

	if(j!=-1)

	{

	driver.switchTo().frame(j);

	//WebDriverWait wd=new WebDriverWait(driver,5);

	//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

	driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

	}

	else{

	System.out.println("ops");

	}

	}

	}


