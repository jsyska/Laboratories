package additionalTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CountPalindrom {

	public static boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {

//		String text = "Madam is eating ara bread";
//		
//		String[]arr = text.split(" ");
//		List<String> palindroms = new ArrayList<>();
//		
//		for(String s: arr) {
//			if(isPalindrome(s))
//				palindroms.add(s);
//		}
//		
//		System.out.println("Word occurence: " + palindroms.size());
//		String longest = "";
//		
//		for(String s: palindroms) {
//			if(s.length() > longest.length())
//				longest = s;
//		}
//		System.out.println("The longest word: " + longest);
//		
		String txt ="Madam";
		String[] xd = txt.split("");
		System.out.println(Arrays.toString(xd));
		
		
	}
	
}
