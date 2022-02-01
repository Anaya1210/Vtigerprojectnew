package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRetryAnalyzer {
	
	@Test(retryAnalyzer=com.crm.genericlib.ReTryAnalyzerTest.class)
	public void amazontest() {
		
		Assert.assertEquals("A", "B");
	}


}
