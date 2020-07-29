package com.udemy.selenium.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four_WindoHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	
		
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			  //If window handle is not main window handle then close it 
			  if(!childWindowHandle.equals(mainWindowHandle)){
			  driver.switchTo().window(childWindowHandle);
			  System.out.println("1.Below is ChildWindow URL ====>");
			  System.out.println(driver.getCurrentUrl());
			  System.out.println("2.Below is Childwindow Text ====>");
			  System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
			  
			  
			  // Close child windows
			  driver.close(); 
			  }
			} 
		
		driver.switchTo().window(mainWindowHandle);
		System.out.println("3.Below is ParentWindow URL ====>");
		System.out.println(driver.getCurrentUrl());
		System.out.println("4.Below is ParentWindow Text ====>");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		

	}

}
