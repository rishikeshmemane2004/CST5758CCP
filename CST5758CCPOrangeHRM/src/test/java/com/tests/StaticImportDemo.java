package com.tests;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticImportDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		out.println(max(10,20));
		out.println(min(10,20));
		
		
	}
	
}
