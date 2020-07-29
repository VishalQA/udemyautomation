package com.udemy.selenium.assignments;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Six_CheckBoxelectAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		

		
		System.out.println("Print all the options inside the Checkbox Example");
		List<WebElement> checkboxes1=driver.findElements(By.xpath("//div[@id='checkbox-example']//fieldset"));
		for (WebElement checkbox: checkboxes1) {
		   System.out.println(checkbox.getText());
//		   System.out.println(checkbox.getSize());
//		   System.out.println(checkbox.getClass());
		   	
		 System.out.println(checkbox.isDisplayed());
		 System.out.println(checkbox.isEnabled());
		 Boolean b = checkbox.isSelected();
		 System.out.println(b);
		

		 if ((b != true )){ 
				 checkbox.click();
		 }

		 
	}

		
		
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for(int l = 0; l < itemCount; l++)
		{
		    System.out.println(e.get(l).getText());
		}
		

	
}

	}

