package practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericlib.BaseClassAnnotation;

@Listeners(com.crm.genericlib.ListImpClass.class)
public class SampleItestListener extends BaseClassAnnotation{
	
	@Test
	public void aaaaa() throws Throwable{
		System.out.println("=======Test Start=====");
		Assert.assertEquals(false,true);
		System.out.println("======Test End======");
	}
	

}
