package DependsOn;

import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void Boat()
	{
		System.out.println("I m in group");
	}
	@Test
	public void Dear()
	{
		System.out.println("Good one");
	}
	@Test
	public void Cool()
	{
		System.out.println("I m in group second");
	}

	@Test(dependsOnMethods= {"Boat","Dear"})
	public void App()
	{
		System.out.println("Good Bad");
	}


}
