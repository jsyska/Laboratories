package start;

import java.io.File;

public class Lab6 {

	public static int calculateFactorialI(int n) {
		int result = 1;
		for(int i = 1; i< n+1;i++) {
			result *= i;
		}
	return result;
	}
	
	public static int calculateFactorialR(int n) {
		if(n == 0) return 1;
		else return n * calculateFactorialR(n-1);
	}
	
	public static int greatestCommonDivisorI(int a, int b) {
	
		int gcd = 1;
		for(int i = 1; i<a && i < b; i++) {
			if(a%i == 0 && b%i == 0) gcd = i;
		}
		
		return gcd;
	}
	
	public static int greatestCommonDivisorR(int a, int b) {
		if (b == 0) return a;
		return greatestCommonDivisorR(b, a%b);
	}
	
	public static int sumOfPositiveValuesI(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>0) sum += arr[i];
		}
		return sum;
	}
	
	public static int sumOfPositiveValuesR(int[] arr, int index) {
		if(index == 0 ) return 0;
		if(arr[index]>0) return arr[index] + sumOfPositiveValuesR(arr, index-1);
		return sumOfPositiveValuesR(arr, index-1);
	}
	
	public static Long getFilesLength(File dirDirectory) {
		Long length = new Long(0);
		
		for(File file: dirDirectory.listFiles()) {
			if(file.isDirectory()) {
				continue;
			}
			else {
				if(file.getName().toLowerCase().endsWith(".txt")) {
					length += file.length();
				}
			}
		}
		return length;
	}
	
	
	public static int countFiles(String extension, File dirDirectory) {
	    int counter = 0;

	    for (File filItem : dirDirectory.listFiles()) {
	        if (filItem.isDirectory()) {
	        	counter += countFiles(extension, filItem);
	        }
	        else {
	        	if(filItem.getName().toLowerCase().endsWith(extension)) counter ++;
	        }
	    }

	    return counter;
	}
	
	public static Long getTotalFilesLength(File dirDirectory) {
	    Long length = new Long(0);

	    for (File filItem : dirDirectory.listFiles()) {
	        if (filItem.isDirectory()) {
	        	length += getTotalFilesLength(filItem);
	        }
	        else {
	        	if(filItem.getName().toLowerCase().endsWith(".txt")) length += filItem.length();
	        }
	    }

	    return length;
	}
	
	public static Long getAverageLength(File dirDirectory) {
		Long totalLength = getTotalFilesLength(dirDirectory);
		int numOfFiles = countFiles(".txt", dirDirectory);
		return totalLength/(long)numOfFiles;
	}

	
	public static void main(String[] args) {
		int f = 5;
		System.out.println("Calculate factorial of: " + f);
		System.out.println("Iteration: " + calculateFactorialI(f));
		System.out.println("Recursion: " + calculateFactorialR(f));
		
		System.out.println();
		int a = 121;
		int b = 55;
		System.out.println("Greatest common divisor of: " + a +" and " + b);
		System.out.println("Iteration: " + greatestCommonDivisorI(a, b));
		System.out.println("Recursion: " + greatestCommonDivisorR(a, b));
		
		System.out.println();
		int[] arr = {-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8,-9,10};
		System.out.println("The sum number of values > 0 that form an integer array ");
		System.out.println("Iteration: " + sumOfPositiveValuesI(arr));
		System.out.println("Recursion: " + sumOfPositiveValuesR(arr, arr.length-1));
		
		System.out.println();
		System.out.println("Calculate the total length of all *.txt files in a given folder");
		File startFolder = new File("lab6Directory");
		System.out.print("The total length of all files is: " + getFilesLength(startFolder));
		
		System.out.println();
		System.out.println();
		System.out.println("Calculate the total number of all files with a given extension in a given folder and all of its subfolders.");
		String extension = ".html";
		System.out.println("There is " + countFiles(extension, startFolder) + " files with " + extension + " extension");
		
		System.out.println();
		System.out.println("Calculate the average length of all *.txt files in a given folder and all of its subfolders.");
		System.out.println(getAverageLength(startFolder));
		
		
		
		
//		File startFolder=new File(path);
//		size=getFileSize(startFolder);
//		System.out.print("all files contain:\t"+size+" bytes\n");


	}
	
}
