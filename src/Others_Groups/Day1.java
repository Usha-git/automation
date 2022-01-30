package Others_Groups;


import org.testng.annotations.Test;

public class Day1 {
	//TestNg 4
	@Test(groups= {"Smoke"})
	public void preRequisite()
	{
		System.out.println("I m in groups");
	}
	@Test
	public void postRequisite()
	{
		System.out.println("Good one");
	}
	@Test(groups= {"Smoke"})
	public void precond()
	{
		System.out.println("I m in groups second");
	}

	@Test
	public void postcond()
	{
		System.out.println("Good Bad");
	}


}
