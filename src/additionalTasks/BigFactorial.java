package additionalTasks;
import java.math.BigDecimal;

import com.google.common.math.BigIntegerMath;

public class BigFactorial {
	public static void main(String[] args) {
		
		System.out.println(BigIntegerMath.factorial(50));	
		
		System.out.println(factorial(50));
	}
	
	public static BigDecimal factorial(int n) {
		BigDecimal fact = new BigDecimal("1");
		for(int i = 1; i<n+1;i++) {
			fact  = fact.multiply(BigDecimal.valueOf(i));
		}
		return fact;
	}
	
	
}


