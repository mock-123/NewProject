package t1;
import org.testng.annotations.Test;



public class test 
{

	
	@Test
	public void pre()
	{
		System.out.println("this is test class");
		String value = System.getProperty("browserName");
		System.out.println(value);
	
		String value2 = System.getProperty("platformName");
		System.out.println(value2);
		
		String value3 = System.getProperty("urlName");
		System.out.println(value3);
	
	}
}
