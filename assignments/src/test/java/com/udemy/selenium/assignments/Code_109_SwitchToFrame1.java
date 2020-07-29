package com.udemy.selenium.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Code_109_SwitchToFrame1 {

	

	public static int gotoframe(WebDriver driver,By by)

	{

	driver.switchTo().defaultContent();

	int i;

	int num = -1;

	int a=driver.findElements(By.tagName("iframe")).size();

	for(i=0;i<a;i++)

	{

	driver.switchTo().defaultContent();

	driver.switchTo().frame(i);

	int b=driver.findElements(by).size();

	if(b>0)

	{

	num=i;

	break;

	}

	}

	driver.switchTo().defaultContent();

	return num;

	}


	}
	

