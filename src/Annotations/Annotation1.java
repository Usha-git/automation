package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	
	//testNg3.xml for this file 

	@BeforeClass
	public void bfClass()
	{
		System.out.println("Before executing any method in the class");
	}
	@AfterClass
	public void afClass()
	{
		System.out.println("After executing all the method in the class");
	}
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("I will execute first");
	}
	@BeforeMethod
	public void forEvery()
	{
		System.out.println("I m executing before method");
	}
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I m executing After method");
	}
	@Test
	public void ploan()
	{
		System.out.println("Good");
	}
	@Test
	public void mloan()
	{
		System.out.println("Good mloan");
	}
	@BeforeSuite
	public void precond()
	{
		System.out.println("I m before suite");
	}

	@AfterTest
	public void ploan2()
	{
		System.out.println("I will execute last");
	}

}
