package start;

import java.math.BigDecimal;
import java.util.Arrays;


public class Lab5 {

	static int[] toNumberArray(int value) {
		String str = Integer.toString(value);
		String[] arr = str.split("");
		int[] newArr = new int[str.length()];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = Integer.parseInt(arr[i]);
		}
		return newArr;
	}
	
	static int[] toNumberArray(String value) {
		String[] arr = value.split("");
		int[] newArr = new int[value.length()];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = Integer.parseInt(arr[i]);
		}
		return newArr;
	}
	
	static int arrToNumber(int[] arr) {
		String snum = "";
		for(int i:arr) {
			snum+= Integer.toString(i);
		}
		return Integer.parseInt(snum);
	}
	
	static String arrToString(int[] arr) {
		String snum = "";
		for(int i:arr) {
			snum+= Integer.toString(i);
		}
		return snum;
	}
	
	static int[] addNumberArrays2(int[] a1, int[] a2) {
		
		BigDecimal num1 = new BigDecimal(arrToString(a1));
		BigDecimal num2 = new BigDecimal(arrToString(a2));
		BigDecimal sum = num1.add(num2);
		String[] temp = sum.toString().split("");
		int[] result = new int[temp.length];
		
		for (int i = 0; i<temp.length; i++) {
			result[i] = Integer.parseInt(temp[i]);
		}
		
		return result;	
	}
	
	static int[] multiplyNumberArrays2(int[] a1, int[] a2) {
		
		BigDecimal num1 = new BigDecimal(arrToString(a1));
		BigDecimal num2 = new BigDecimal(arrToString(a2));
		BigDecimal sum = num1.multiply(num2);
		String[] temp = sum.toString().split("");
		int[] result = new int[temp.length];
		
		for (int i = 0; i<temp.length; i++) {
			result[i] = Integer.parseInt(temp[i]);
		}
		
		return result;	
	}

	public static void fillWith(int[] inOutArr, int filValue) {
		for( int i = 0; i< inOutArr.length; i++) {
			inOutArr[i]=filValue;
		}
	}
	
	public static void reverseMe(int[] inArr) {
		int start = 0;
		int end = inArr.length-1;
		int temp;
		while(start<end) {
			temp = inArr[start];
			inArr[start] = inArr[end];
			inArr[end] = temp;
			start++;
			end--;
		}
		
	}
	
	static int[] flattenArr(int[][] data) {
		int len = 0;
		for (int[] a : data) {
			len += a.length;
		}
		
		int[] temporaryArray = new int[len];
		int index = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++, index++) {
				temporaryArray[index] = data[i][j];
			}
		}
		return temporaryArray;
	}
	
	public static void reverseMe(int[][] inArr) {
		int start = 0;
		int end = inArr.length-1;
		int[] temp;
		while(start<end) {
			temp = inArr[start];
			inArr[start] = inArr[end];
			inArr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static String reverseMe(String str) {
		return new StringBuilder(str).reverse().toString(); 
	}
	
	static int[] addNumberArrays(int[] a1, int[] a2) {
		if (a2.length < a1.length) {
			int [] temp = a1;
			a1=a2;
			a2=temp;
		}
		
		String str1 = arrToString(a1);
		String str2 = arrToString(a2);
		
		 String result = "";  
		   
		    int n1 = str1.length(), n2 = str2.length();  
		  
		    str1= reverseMe(str1);
		    str2= reverseMe(str2); 
		  
		    int carry = 0;  
		    for (int i = 0; i < n1; i++)  
		    {  
		        //school mathematics 
		        int sum = Character.getNumericValue(str1.charAt(i))+  
		        		Character.getNumericValue(str2.charAt(i)) + carry;  
		        result += String.valueOf(sum % 10);  
		  
		        carry = sum / 10;  
		    }  
		  
		    // Add remaining digits of larger number  
		    for (int i = n1; i < n2; i++)  
		    {  
		        int sum = Character.getNumericValue(str2.charAt(i)) + carry;  
		        result += String.valueOf(sum % 10);  
		        carry = sum / 10;  
		    }  
		  
		    // Add remaining carry  
		    if (carry > 0)  
		        result += (char)(carry + '0');  
		  
		    // reverse resultant String 
		    result = reverseMe(result);
		    
		String[] finalS = result.split("");
		int[] finalI = new int[finalS.length];
		for(int i = 0; i< finalS.length;i++) {
			finalI[i] = Integer.valueOf(finalS[i]);
		}
		
		return finalI;
		
	}

	static int[] differenceNumberArrays(int[] a1, int[] a2) {
		if(a1[0] < 0) a1[0] = Math.abs(a1[0]);
		if(a2[0] < 0) a2[0] = Math.abs(a2[0]);
		
		
		String str1 = arrToString(a1);
		String str2 = arrToString(a2);
		
		BigDecimal temp1 = new BigDecimal(str1);		
		BigDecimal temp2 = new BigDecimal(str2);		
		 if (temp1.compareTo(temp2) < 0) {
	            String t = str1;
	            str1 = str2;
	            str2 = t;
	        }
		
		 String result = "";  
		   
		    int n1 = str1.length(), n2 = str2.length();  
		  
		    str1= reverseMe(str1);
		    str2= reverseMe(str2); 
		  
		    int carry = 0;  
		    for (int i = 0; i < n2; i++)  
		    {  
		        //school mathematics  
		        int dif = Character.getNumericValue(str1.charAt(i))- 
		        		Character.getNumericValue(str2.charAt(i)) - carry;  
		        // dif<0
		        if(dif<0) {
		        	dif += 10;
		        	carry=1;
		        }
		        else carry = 0;
		        
		        
		        result += String.valueOf(dif);  
		  
		    }  
		  
		    // subtract remaining digits of larger number  
		    for (int i = n2; i < n1; i++)  
		    {  
		        int dif = Character.getNumericValue(str1.charAt(i)) - carry;  
		        
		        if( dif < 0) {
		        	dif += 10;
		        	carry =1;
		        } else carry = 0;
		        
		        result += String.valueOf(dif);   
		    }  
		  
		    // reverse resultant String 
		    result = reverseMe(result);
		    
		String[] finalS = result.split("");
		int[] finalI = new int[finalS.length];
		for(int i = 0; i< finalS.length;i++) {
			finalI[i] = Integer.valueOf(finalS[i]);
		}
		
		return finalI;
		
	}
	
	static int[] addNumberArraysMinus(int[] a1, int[] a2) {
		if (a2.length > a1.length) {
			int [] temp = a1;
			a1=a2;
			a2=temp;
		}
		
		
		int[] a3 = new int[a1.length];
		if(Math.abs(a1.length-a2.length)>0) {
			fillWith(a3, 0);
			for(int i = 1; i <=a2.length;i++) {
				a3[a3.length-i] = a2[a2.length-i]; 
			}
		}else {
			a3=a1;
		}
		
		
		int[] newArr = new int[a1.length];
		for(int i = 0;i<newArr.length;i++) {
			newArr[i] = a1[i] + a3[i];
		}
		
		reverseMe(newArr);
		for(int i = 0; i<newArr.length-1;i++) {
			if(newArr[i]>9) {
				newArr[i] = newArr[i]%10;
				newArr[i+1]= newArr[i+1] +1;
			}
			if(newArr[i]<0) {
				newArr[i] = newArr[i]+10;
				newArr[i+1]= newArr[i+1] -1;
			}
		}
		
		if(newArr[newArr.length-1] > 9) {
			newArr = Arrays.copyOf(newArr, newArr.length+1);
			newArr[newArr.length-2] = newArr[newArr.length-2]%10;
			newArr[newArr.length-1]= newArr[newArr.length-1] +1;
		}
		if(newArr[newArr.length-1] == 0) {
			newArr = Arrays.copyOf(newArr, newArr.length-1);
		}
		reverseMe(newArr);
		return newArr;
	}
	

	public static int[] multiplyNumberArrays(int[] a1, int[] a2) 
	{
		String num1 = arrToString(a1);
		String num2 = arrToString(a2);
		int[] temp = {};
	    int len1 = num1.length(); 
	    int len2 = num2.length(); 
	    if (len1 == 0 || len2 == 0) {
	        return temp; 
	    }
	  
	    //result in reverse order
	    int result[] = new int[len1 + len2]; 
	  
	    
	    // indexes in result arr
	    int i_n1 = 0;  
	    int i_n2 = 0;  
	       
	    for (int i = len1 - 1; i >= 0; i--) 
	    { 
	        int carry = 0; 
	        int n1 = Character.getNumericValue(num1.charAt(i)); 
	  
	        // To shift position to left after every multipliccharAtion of a digit in num2 
	        i_n2 = 0;  
	                      
	        for (int j = len2 - 1; j >= 0; j--) 
	        { 
	            // Take current digit of second number 
	            int n2 = Character.getNumericValue(num2.charAt(j)); 
	    
	            int sum = n1 * n2 + result[i_n1 + i_n2] + carry; 
	  
	            carry = sum / 10; 
	  
	            result[i_n1 + i_n2] = sum % 10; 
	  
	            i_n2++; 
	        } 
	  
	        if (carry > 0) 
	            result[i_n1 + i_n2] += carry; 
	  
	        // To shift position to left after every multipliccharAtion of a digit in num1. 
	        i_n1++; 
	    } 
	  
	    // ignore '0's from the right 
	    int i = result.length - 1; 
	    while (i >= 0 && result[i] == 0) 
	    i--; 
	  
	    if (i == -1) 
	    return temp; 
	  
	    // generate result
	    String s = ""; 
	      
	    while (i >= 0) 
	        s += (result[i--]); 
	    String[] finalS = s.split("");
	    int[] finalI = new int[finalS.length];
	    for (int j = 0; j < finalS.length;j++) {
	    	finalI[j] = Integer.parseInt(finalS[j]);
	    }
	    return finalI; 
	} 
	
	
	public static void main(String[] args) {
		
		System.out.println("To number array:");
		System.out.println(Arrays.toString(toNumberArray(123)));
		
		System.out.println();
		System.out.println("To number array (argument is of the type string): ");
		System.out.println(Arrays.toString(toNumberArray("7634")));
		
		System.out.println();
		System.out.println("Add number arrays");
		int[] a1 = {1,9};
		int[] a2 = {8,2};
		System.out.println(Arrays.toString(addNumberArrays(a1,a2)));
		System.out.println(Arrays.toString(addNumberArrays2(a1,a2)));
		
		System.out.println();
		System.out.println("Subtract number arrays");
		int[] a5 = {8,2,3,3,1,2,3,1,3,5,4,5,6,7,7,6,5,4,3,3,3,3,2,2,1,1};
		int[] a6 = {-1,9,2,1,3,2,1,3,1,3,1,3,2,3,1,3,2,1,2,3,1,3,2,1,3,2};
		System.out.println(Arrays.toString(differenceNumberArrays(a5, a6)));
		
		System.out.println();
		int[]a3 = {1,9,2,1,3,2,1,3,1,3,1,3,2,3,1,3,2,1,2,3,1,3,2,1,3,2};
		int[]a4 = {8,2,3,3,1,2,3,1,3,5,4,5,6,7,7,6,5,4,3,3,3,3,2,2,1,1};
		System.out.println("Multipy number arrays");
		System.out.println(Arrays.toString(multiplyNumberArrays2(a3, a4)));
		System.out.println(Arrays.toString(multiplyNumberArrays(a3, a4)));
		
	}

}
