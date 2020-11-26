package additionalTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;


public class PiDigits {
	
	public static BigDecimal betterCalcPi(long acc) {
		BigDecimal k1 = new BigDecimal("545140134");
		BigDecimal k2 = new BigDecimal("13591409");
		BigDecimal k3 = new BigDecimal("640320");
		BigDecimal k4 = new BigDecimal("100100025");
		BigDecimal k5 = new BigDecimal("327843840");
		BigDecimal k6 = new BigDecimal("53360");
		//because long cannot store a number as big as k4*k5*8 we have to calculate it using BigDecimal
		BigDecimal constant1 = k4.multiply(k5).multiply(BigDecimal.valueOf(8));
		
		BigDecimal s = new BigDecimal("0");
		for (int i = 0; i < acc; i++) {
			
			BigDecimal numerator = (k2.add(k1.multiply(BigDecimal.valueOf(i)))).multiply(factorial(6*i));
			
			BigDecimal denominator = (factorial(i).pow(3)).multiply(factorial(3*i)).multiply(constant1.pow(i));
			s = s.add(new BigDecimal("-1").pow(i).multiply(numerator).divide(denominator,100000, RoundingMode.HALF_EVEN));
		}
		return k6.multiply(k3.sqrt(new MathContext(100000))).divide(s,100000,RoundingMode.HALF_EVEN);
	}
	
	
	public static BigDecimal factorial(int n) {
		BigDecimal fact = new BigDecimal("1");
		for(int i = 1; i<n+1;i++) {
			fact  = fact.multiply(BigDecimal.valueOf(i));
		}
		return fact;
	}
	
	
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		BigDecimal calculatedPi = betterCalcPi(2000);
		System.out.println(calculatedPi);
		
		String test = String.valueOf(calculatedPi);
		String data = "";
		try {
		      File myObj = new File("DigitsOfPi10M.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		    	  data += myReader.nextLine();
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println("Checking ...");
		int counter = 0;
		try {
			while(test.charAt(counter+2) == data.charAt(counter)) {
				counter++;
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println(counter + " digits are corect");
		}
		
		long endTime = System.nanoTime();

		long duration = (endTime - startTime)/1000000000;  //divide by 1000000 to get milliseconds.
		System.out.println(counter + " digits are corect");
		System.out.println("It took " + duration + "seconds");
		
	
	}
}


