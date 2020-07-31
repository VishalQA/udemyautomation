package com.udemy.selenium.assignments;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VJ_Code_100_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the month year to be selected in the format as (Month year) ====>");
		Scanner input1 = new Scanner(System.in);
		String monthyear  = input1.nextLine();
		System.out.println("You entered the month year  ===>"  +monthyear);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the date number===>");
		String date = input2.nextLine();
		System.out.println("You entered  date number as ===>"  +date);
		
//		Date date1 = new Date();
//		String entereddate = (date1.toString().trim());
//		System.out.println(date1.toString());
//		
		
		
		System.out.println("Now sit relax and watch the selected date will be picked in the calender");
		
//		Date date2 = new Date();
//		String lastDate = (date2.toString().trim());
//		// display time and date using toString()
//		System.out.println(date2.toString());
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		
		
		
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains(monthyear))
		{
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
		
		List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("ui-state-default")).size();
		
		
		
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
		if(text.equalsIgnoreCase(date))
		{
		driver.findElements(By.className("ui-state-default")).get(i).click();
		break;
		}
		 
		
		}
	
		

	}

	
}

		

		



