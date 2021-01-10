import org.testng.annotations.Test;

public class samePriorityTestcase {
	
	@Test(priority=1)
	public void Test1()
	{
		System.out.println("This is Test 1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("This is Test 2");
	}
	
	@Test(priority=1)
	public void Test3()
	{
		System.out.println("This is Test 3");
	}
	
}
