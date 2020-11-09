package t1;
import org.testng.annotations.Test;



public class test 
{

	
	@Test
	public void pre()
	{
		System.out.println("this is test class");
		String value = System.getProperty("browser");
		System.out.println(value);
	
		String value2 = System.getProperty("platform");
		System.out.println(value2);
		
		String value3 = System.getProperty("url");
		System.out.println(value3);
	
	}
}
