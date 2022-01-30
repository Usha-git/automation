package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	@Test
	public void Dear()
	{
		System.out.println("Good one data");
	}
	@Parameters({"URL"})
	@Test
	public void Cool(String urln)
	{
		System.out.println("I m in group three");
		System.out.println(urln);
	}
}
