import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssert {

	@Test
	public void test1(){
	System.out.println("Test Case Started");
	Assert.assertEquals(13, 13);		
	System.out.println("Test Cases Ended");
	}
	@Test
	public void test2() {
		System.out.println("Test Case Started");
		Assert.assertEquals("Hello","Hello1","Matching failure" );
		System.out.println("Test Cases Ended");
	}
}
