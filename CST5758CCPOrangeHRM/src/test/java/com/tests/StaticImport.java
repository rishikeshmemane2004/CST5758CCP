package com.tests;

import static java.lang.Math.max;

import java.util.Random;

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println("max of 2nos : "  + max(10, 20));
		Random rnd = new Random();
		int cnt = 0;
		while(cnt<=10)
		{
			System.out.println(rnd.nextInt(100));
			cnt++;
		}	
	}
}
