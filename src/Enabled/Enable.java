package Enabled;

import org.testng.annotations.Test;

public class Enable {
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
	@Test(enabled=false)
	public void Cool()
	{
		System.out.println("I m in group second");
	}

	@Test
	public void App()
	{
		System.out.println("Good Bad");
	}

}
