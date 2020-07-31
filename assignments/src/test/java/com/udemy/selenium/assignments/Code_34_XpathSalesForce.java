package com.udemy.selenium.assignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	
public class Code_34_XpathSalesForce {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

driver.get("https://login.salesforce.com/");
driver.findElement(By.id("username")).sendKeys("hello");
driver.findElement(By.name("pw")).sendKeys("123456");
//driver.findElement(By.className("button r4 wide primary")).click();//Error
driver.findElement(By.xpath("//*[@id='Login']")).click();
System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

}
}