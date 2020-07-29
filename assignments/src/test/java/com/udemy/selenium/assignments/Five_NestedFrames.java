package com.udemy.selenium.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Five_NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		int size = driver.findElements(By.tagName("frameset")).size();
		
		System.out.println("The number of Frameset===>"  +size);

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		System.out.println("The text written in the middle Frame is ====> " );
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.xpath(" //div[@id='content']")).getText());
		
			}
	}


