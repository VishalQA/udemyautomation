package com.udemy.selenium.assignments;


import java.net.MalformedURLException;

import java.net.URL;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;



public class Code_334_SauceLab {


public static final String USERNAME = "vishal.mailbox1";

  public static final String ACCESS_KEY = "579a59b6-be14-4443-8baa-01704d8310e0";

  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub



DesiredCapabilities caps = DesiredCapabilities.chrome();

caps.setCapability("platform", "Windows 10");

caps.setCapability("version", "51.0");

WebDriver driver=new RemoteWebDriver(new URL(URL), caps);

driver.get("http://google.com");

System.out.println(driver.getTitle());

}



}

