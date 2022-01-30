package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//TestNg5
public class Parameter {
	
	@Parameters({"URL"})
	@Test
	public void Boat(String urlName)
	{
		System.out.println("I m in group");
		System.out.println(urlName);
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


}
