import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest {

	@Test
	public void passTwoNumbersReturnsTheSum() {
		int sum = StringCalculator.add("8,3");
		Assert.assertEquals("This didn't match",11,sum);
	}

	@Test
	public void passThreeNumbersReturnsTheSum() {
		int sum = StringCalculator.add("1,1,3");
		Assert.assertEquals(5,sum);
	}

	@Test
	public void passEmptyStringReturnsZero() {
		int sum = StringCalculator.add("");
		Assert.assertEquals(0,sum);
	}

	@Test
	public void passSpacesReturnsZero() {
		int sum = StringCalculator.add("    ");
		Assert.assertEquals(0,sum);
	}
	
	@Test
	public void passNullReturnsZero() {
		int sum = StringCalculator.add(null);
		Assert.assertEquals(0,sum);
	}	
	
	@Test
	public void passNegativeNumbersReturnsOnlyPositiveNumbersAdded() {
		int sum = StringCalculator.add("1,1,2,3,5,-8,13,21,34");
		Assert.assertEquals(80,sum);
	}	

	@Test(expected = NumberFormatException.class)
	public void passLettersThrowsException() {
		int sum = StringCalculator.add("1,!,2,3,F,-8,13,21,34");
		
	}	
	@Test(expected = Exception.class)
	public void throwsExceptionWithMessage() throws Exception {
		try {
			StringCalculator.testException(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Really Bad Exception",e.getMessage());
			throw e;
		}
		
	}	
	
	@Test(expected = Exception.class)
	public void throwsExceptionWithBadMessage() throws Exception {
		try {
			StringCalculator.testException(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Bad Exception",e.getMessage());
			throw e;
		}
		
	}	
	

	
}
