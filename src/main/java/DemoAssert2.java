import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssert2 {

	@Test
	public void test1(){
	String myStr="Matiul Islam";
		Assert.assertTrue(myStr.contains("Matiul"),"Names are not mtching");
}
	
	@Test
	public void test2(){
	Assert.assertTrue(false);
}	
}
