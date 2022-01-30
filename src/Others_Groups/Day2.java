package Others_Groups;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void MyApp()
	{
		System.out.println("Hi Usha");
	}
	@Test
	public void MyCollege()
	{
		System.out.println("Hello Usha");
	}
	@Test(groups= {"Smoke"})
	public void MyPhone()
	{
		System.out.println("Ring Ring");
	}

}
