package com.udemy.selenium.assignments;


import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Properties;


public class Code_152_TestNGGlobalValues {


public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub



Properties prop=new Properties();

FileInputStream fis =new FileInputStream("C:\\Users\\jaju_v\\git\\udemyautomation\\assignments\\src\\test\\java\\com\\udemy\\selenium\\assignments\\data.properties");

prop.load(fis);

System.out.println(prop.getProperty("browser"));

System.out.println(prop.getProperty("url"));

prop.setProperty("browser", "firefox");

System.out.println(prop.getProperty("browser"));

FileOutputStream fos =new FileOutputStream("C:\\Users\\jaju_v\\git\\udemyautomation\\assignments\\src\\test\\java\\com\\udemy\\selenium\\assignments\\data.properties");

prop.store(fos, null);

}




}

