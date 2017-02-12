package com.testng.annotations.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.annotations.basetest.AbstractTest;

public class TestDriver extends AbstractTest{
	
	@BeforeMethod(groups = {"Regression", "Sanity"})
	public void beforeMethod(){
		System.out.println("Before Method1");
	}
	
	@Test(groups = {"Regression", "Sanity"})
	public void testMethod1(){
		System.out.println("Test Method1");
	}
	
	@Test(groups = {"Regression"})
	public void testMethod2(){
		System.out.println("Test Method2");
	}
	
	@Test(groups = {"Sanity"})
		public void testMethod3(){
			System.out.println("Test Method3");
	}
}
