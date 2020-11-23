package start;

import java.util.Arrays;

public class Lab3 {

	static double calcPi(long accuracy) {
		double pi =2;
		for(double i =1; i <=accuracy;i++) {
			pi *=((2*i)*(2*i))/((2*i-1)*(2*i+1));
		}
		return pi;
	}
	
	static double calcPi2(long accuracy) {
		double pi = 0;
		for(double i =0; i <=accuracy;i++) {
			pi += Math.pow(-1, i)/(2*i+1);
		}
		return pi*4;
	}
	
	static int checkFirstFunction(long acc) {
		double pi =2;
		int counter = 1;
		for(double i =1; i <=acc;i++, counter++) {
			pi *=((2*i)*(2*i))/((2*i-1)*(2*i+1));
			double tempPi = pi*1000000;
			if(Math.round(tempPi) == 3141592) {
				break;
			}
		}
		return counter;
	}
	
//	static int checkFirstFunction(long acc) {
//		double pi =2;
//		int counter = 1;
//		for(double i =1; i <=acc;i++, counter++) {
//			pi *=((2*i)*(2*i))/((2*i-1)*(2*i+1));
//			double tempPi = pi*1000000;
//			if(Math.floor(tempPi) == 3141592) {
//				break;
//			}
//		}
//		return counter;
//	}
	
//	static int checkFirstFunction(long acc) {
//		double pi =2;
//		int counter = 1;
//		for(double i =1; i <=acc;i++, counter++) {
//			pi *=((2*i)*(2*i))/((2*i-1)*(2*i+1));
//			if(Math.PI - pi < 0.0000005) {
//				break;
//			}
//		}
//		return counter;
//	}
	
	static int checkSecondFunction(long acc) {
		double pi = 0;
		int counter = 0;
		for(double i =0; i <=acc;i++,counter ++) {
			pi += Math.pow(-1, i)/(2*i+1);
			double tempPi = pi*4*1000000;
			if(Math.round(tempPi) == 3141592) {
				break;
			}
		}
		return counter;
	}
	
	
	static int[] concatArrs(int data1[], int data2[]) {
		int len1 = data1.length;
		int len2 = data2.length;
		int len3 = len2 + len1;
		int[] finalArr = new int[len3];
		int index = 0;
		for (;index < len1;index++) {
			finalArr[index] = data1[index];
		}
		
		for (int i =0 ;i<len2;i++, index++) {
			finalArr[index]= data2[index-len1];
		}
		return finalArr;
	}
	
	public static void main(String[] args) {
		double firstPi = calcPi(1500000);
		double secondPi = calcPi2(1500000);
		System.out.println("First task: " + firstPi);
		System.out.println("Second task: " + secondPi);
		System.out.println("First value of n for which first function produce proper results is: " + checkFirstFunction(1500000));
		System.out.println("First value of n for which second function produce proper results is: " + checkSecondFunction(1500000));
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		System.out.println("Concatenated arr: " + Arrays.toString(concatArrs(arr1,arr2)));
	}
}
