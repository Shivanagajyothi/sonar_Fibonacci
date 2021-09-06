package TestFibbo;

import org.testng.annotations.Test;
import Fibbo.Fibbonacci;

public class FibboInvoke 
{
@Test
		public void testngexamplee() 
		{
		Fibbonacci t= new Fibbonacci();
		t.main(null);
		System.out.println("\nExecuted Fibonacci Series\n");
		}
}

