package start;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPack {
	
	public static int[] sortOneDimArray(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] readArray(int size) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You want to create an array with " + size + " elements");
		System.out.println("Input values one after another");
		int[] newArray = new int[size];
		for(int i = 0; i < size; i++) {
			String input = scanner.nextLine();
			try {
				if (input == " ")
					newArray[i] = 0;
				else newArray[i] = Integer.parseInt(input);
			}catch(NumberFormatException e) {
				newArray[i] = 0;
			}
		}
		scanner.close();
		return newArray;
	}

	public static int[] appendArrays(int[] a1, int[] a2) {
		int len3 = a1.length + a2.length;
		int[] finalArr = new int[len3];
		int index = 0;
		for (;index < a1.length;index++) {
			finalArr[index] = a1[index];
		}

		for (int i =0 ;i<a2.length;i++, index++) {
			finalArr[index]= a2[index-a1.length];
		}
		return finalArr;
	}

	public int getMinimalElement(int[] inArr) {
		int min = inArr[0];
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] < min) {
				min = inArr[i];
			}
		}
		return min;
	}

	public int[] getMinimalElements(int[] inArr) {
		int min = getMinimalElement(inArr);
		int counter = 0;
		for(int i = 0; i < inArr.length;i++) {
			if(inArr[i]==min) {
				counter++;
			}
		}

		int[] minimalElements = new int[counter];
		for ( int i = 0; i<minimalElements.length;i++) {
			minimalElements[i]=min;
		}
		return minimalElements;
	}
	
	public int[] getGreaterThan(int[] inArr, int limit) {
		int counter = 0;
		for(int i = 0; i<inArr.length;i++) {
			if(inArr[i]>limit) counter++;
		}
		int[] finalArr = new int[counter];
		int index = 0;
		if (counter == 0) System.out.println("There arent any number grater than: " + limit);
		else {
			for(int j = 0; j < inArr.length;j++) {
				if(inArr[j]> limit) {
					finalArr[index] = inArr[j];
					index++;
				}
			}
		}
		return finalArr;
	}

	public int[] getRange(int[] inArr, int lowerLimit, int upperLimit) {
		int counter = 0;
		for(int i = 0; i<inArr.length;i++) {
			if(inArr[i]>lowerLimit && inArr[i]<upperLimit) counter++;
		}
		int[] finalArr = new int[counter];
		int index = 0;
		if (counter == 0) System.out.println("There arent any number in range from " + lowerLimit + " to " + upperLimit);
		else {
			for(int j = 0; j < inArr.length;j++) {
				if((inArr[j]>lowerLimit && inArr[j]<upperLimit)) {
					finalArr[index] = inArr[j];
					index++;
				}
			}
		}
		return finalArr;
	}

	public int elementCount(int[] inArr, int what2Look4) {
		int counter = 0;
		for(int i = 0; i<inArr.length;i++) {
			if(inArr[i] == what2Look4) counter++;
		}
		return counter;
	}

	public static int[] commonElements(int[] a1, int[] a2) {
		int counter = 0;
		for(int i = 0; i<a1.length;i++) {
			for(int j = 0; j < a2.length; j++) {
				if(a1[i] == a2[j]) {
					counter++;
				}
			}
		}
		int[] finalArr = new int[counter];
		int index = 0;

		for(int i = 0; i<a1.length;i++) {
			for(int j = 0; j < a2.length; j++) {
				if(a1[i] == a2[j]) {
					finalArr[index] = a1[i];
					index++;
				}
			}
		}

		return finalArr;
	}

	public static int[] uniqueElements(int[] a1, int[] a2) {
		int[] commonElements = commonElements(a1, a2);
		int[] appendArrays = appendArrays(a1, a2);
		String result = "";

		boolean isUnique = false;
		for(int i = 0; i < appendArrays.length;i++) {
			for (int j = 0; j<commonElements.length;j++) {
				if(appendArrays[i] != commonElements[j]) {
					isUnique= true;
				}
				else {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				result = result + appendArrays[i] + " ";
				isUnique=false;
			}
		}
		String tempArr[] = result.split(" ");
		int finalArr[] = new int[tempArr.length];
		for (int i = 0; i< tempArr.length;i++) {
			finalArr[i] = Integer.parseInt(tempArr[i]);
		}
		return finalArr;
	}
	
//public static int[] uniqueElements(int[] inArr, int[] inArr2) {
//		
//		int[] uniqueElements= new int[0];
//		
//		if(inArr2.length > inArr.length) {
//			int[] tmpArr = inArr;
//			inArr = inArr2;
//			inArr2 = tmpArr;
//		}
//		for (int i: inArr) {
//			boolean isUnique = true;
//			for(int j: inArr2) {
//				if (i == j) isUnique = false; 
//			}
//			if(isUnique) {
//				uniqueElements = Arrays.copyOf(uniqueElements, uniqueElements.length+1);
//				uniqueElements[uniqueElements.length-1] = i ;
//			}
//		}
//		return uniqueElements;
//	}

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
	
	public static int[] returnReversed(int[] inArr) {
		reverseMe(inArr);
		return  inArr;
	}
	
//	public static void showArr(int[] arrIn) {
//		System.out.println(Arrays.toString(arrIn));
//	}
	public static void showArr(int[] arrIn) {
		String result = "[";
		for(int i = 0;i<arrIn.length;i++) {
			result += Integer.toString(arrIn[i]);
			if(i != arrIn.length -1) result +=", ";
		}
		result+= "]";
		System.out.println(result);
	}
	
//	public static void showArr(int[] arrIn) {
//		for(int i = 0; i < arrIn.length;i++) {
//			System.out.println(arrIn[i]);
//		}
//	}
	
	public static int[] getMinimals (int[][] inArr) {
		ArrayPack ap = new ArrayPack();
		int [] minimals = new int[inArr.length];
		int index = 0;
		for(int i = 0; i<inArr.length;i++) {
			minimals[index++] = ap.getMinimalElement(inArr[i]);
		}
		return minimals;
	}
	
	//TESTING METHODS
	
	public static void main(String[] args) {
		//Read array
		ArrayPack ap = new ArrayPack();
		int[] arr = ArrayPack.readArray(4);
		System.out.println(Arrays.toString(arr));
		
		//append arrays
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {6,7,8,9,10};
		int[] a3 = ArrayPack.appendArrays(a1, a2);
		System.out.println();
		System.out.println("Append arrays");
		System.out.println(Arrays.toString(a3));
		System.out.println();
		
		//get minimal element
		int[] a4 = {4,2,6,18,23,25,65,3};
		int minfromA4 = ap.getMinimalElement(a4);
		System.out.println("Minimal element: " + minfromA4);
		
		//get minimal elements
		System.out.println();
		int[] a5 = {2,3,1,1,4,2,6,18,23,25,65,3};
		int[] minimalElementsFroma5 = ap.getMinimalElements(a5);
		System.out.println("Minimal elements: " + Arrays.toString(minimalElementsFroma5));
	
		//get greater than
		System.out.println();
		int[] a6 = {2,1,5,7,13,22,67,3,7,21,65,34,14,18,24, 19, 20};
		int limit = 19;
		System.out.println("Get greater than: " + limit);
		int[] greaterThanLimit = ap.getGreaterThan(a6, limit);
		System.out.println(Arrays.toString(greaterThanLimit));
		
		//get range
		System.out.println();
		int[] a7 = {2,1,5,7,13,22,67,3,7,21,65,34,14,18,24, 19, 20, 57, 55,89,111};
		int lowerLimit = 11;
		int upperLimit = 49;
		System.out.println("In range from " + lowerLimit + " to " + upperLimit);
		int[] arrayInRange = ap.getRange(a7, lowerLimit, upperLimit);
		System.out.println(Arrays.toString(arrayInRange));
		
		//element count
		System.out.println();
		int[] a8 = {1,4,2,5,7,44,2,3,4,6,2,4,2,5,6,9,99,2,14,2,152,2};
		int what2Look4 = 2;
		System.out.println("How many " + what2Look4 + " in array: " + ap.elementCount(a8, what2Look4));
		
		//common elements
		System.out.println();
		int[] a9 = {1,3,5,6,7,8,9,13,10,11,12,15,17,18};
		int[] a10 = {2,4,6,8,10,12,14,16,18};
		System.out.println("Alements that are in both arrays:");
		int[] commonEelements = ArrayPack.commonElements(a9, a10);
		System.out.println(Arrays.toString(commonEelements));
		
		
		//unique elements
		System.out.println();
		int[] uniqueElements = ArrayPack.uniqueElements(a9,a10);
		System.out.println("Elements that are unique: ");
		System.out.println(Arrays.toString(uniqueElements));
		
		//fill array
		System.out.println();
		int[] arrayToFill = new int[20];
		int fillValue = 7;
		ArrayPack.fillWith(arrayToFill, fillValue);
		System.out.println("Array has been filled with: " + fillValue);
		System.out.println(Arrays.toString(arrayToFill));
		
		//reverse on spot
		System.out.println();
		int[] arrToReverse = {1,2,3,4,5,6};
		ArrayPack.reverseMe(arrToReverse);
		System.out.println("Reversed array: ");
		System.out.println(Arrays.toString(arrToReverse));
		
		//return reverse 
		System.out.println();
		int[] arrToReverse2 = {1,2,3,4,5,6};
		int[] reversedArray =ArrayPack.returnReversed(arrToReverse2);
		System.out.println("Returned reversed array: ");
		System.out.println(Arrays.toString(reversedArray));
		
		//show array
		System.out.println();
		int[] arrToShow = {1,2,3,4,5,6,7,8,9};
		System.out.println("ShowArr method");
		ArrayPack.showArr(arrToShow);
		
		//get minimals
		System.out.println();
		int[][] arr11 = {{5,44,32,121,22,2}, {12,141,24,254,56,44,21}, {11,11,12,15,7,7}};
		System.out.println("Minimal values from each row of two dimensional array: ");
		System.out.println(Arrays.toString(ArrayPack.getMinimals(arr11)));
	}
	
}

