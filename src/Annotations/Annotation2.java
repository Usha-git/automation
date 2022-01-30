package Annotations;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;

public class Annotation2 {
	
	@Test
	public void postRequisite()
	{
		System.out.println("I will execute next");
	}
	@Test
	public void postRequisite1()
	{
		System.out.println("Good one");
	}
	@AfterSuite
	public void postcond()
	{
		System.out.println("I m After suite");
	}


}
