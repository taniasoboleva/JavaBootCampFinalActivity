package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	private Calculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		
		theCalculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetSum() {
		
		int a = 5;
		int b = 10;			
	
		assertEquals(15, (theCalculator.getSum(a,b)));
		assertEquals(15, (theCalculator.getSum(b,a)));		

		a = -5;		
		b = 10;		
		
		assertEquals(5, (theCalculator.getSum(a,b)));
		assertEquals(5, (theCalculator.getSum(b,a)));
		
		a = -5;		
		b = -10;		
		
		assertEquals(-15, (theCalculator.getSum(a,b)));
		assertEquals(-15, (theCalculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 3;
		int b = 2;		
	
		assertEquals(1, (theCalculator.getSubtraction(a, b)));		
		
		assertEquals(-1, (theCalculator.getSubtraction(b,a)));

		a = 5;
		b = -4;

		assertEquals(9, (theCalculator.getSubtraction(a,b)));		

		assertEquals(-9, (theCalculator.getSubtraction(b,a)));	
	
		a = -10;
		b = -5;
	
		assertEquals(-5, (theCalculator.getSubtraction(a,b)));		

		assertEquals(5, (theCalculator.getSubtraction(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 5;
		double b = 10;			

		assertEquals(50, (theCalculator.getMultiplication(a,b)),0);
		assertEquals(50, (theCalculator.getMultiplication(b,a)),0);		

		a = -5;		
		b = 10;		

		assertEquals(-50, (theCalculator.getMultiplication(a,b)),0);
		assertEquals(-50, (theCalculator.getMultiplication(b,a)),0);
		
		a = -3;		
		b = -10;		

		assertEquals(30, (theCalculator.getMultiplication(a,b)),0);
		assertEquals(30, (theCalculator.getMultiplication(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;		

		assertEquals(2, (theCalculator.getDivision(a,b)),0);		
	
		assertEquals(0.5, (theCalculator.getDivision(b,a)),0);

		a = 9;	b = -3;

		assertEquals(-3, (theCalculator.getDivision(a,b)),0);		

		assertEquals(-0.33, (theCalculator.getDivision(b,a)),0.007);	
	
		a = -10;	b = -5;
	
		assertEquals(2, (theCalculator.getDivision(a,b)),0);		
	
		assertEquals(0.5, (theCalculator.getDivision(b,a)),0);			
		}
		
		public void testThrowException(){
			
			try {

				theCalculator.getSum(2, 1);
				theCalculator.getSubtraction(3, 3);
				theCalculator.getMultiplication(0, 1);
				theCalculator.getDivision(1, 0);
				new Calculator();
					
			} catch (Exception e) {
				fail();
			}
			  catch (Error e) {
				fail();
			}
		}
	}

