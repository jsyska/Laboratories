package start;

import java.util.Arrays;

public class Lab2 {

	static void printMaxValue(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max value of oneDIm array: " + max);
	}

	static void printMaxValue(int[][] arr) {

		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);

	}

	static void printMostCommonDigit(int[] arr) {

		int[] count = new int[200];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int mostCommon = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > count[mostCommon]) {
				mostCommon = i;
			}
		}
		System.out.println(mostCommon);
	}

	static void printMostCommonDigit(int[][] arr) {

		int[] count = new int[88];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				count[arr[i][j]]++;
			}
		}
		int mostCommon = 0;
		String result = "";
		for (int i = 0; i < count.length; i++) {
			if (count[i] > count[mostCommon]) {
				mostCommon = i;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == count[mostCommon]) {
				result = result + i + ", ";
			}
		}
		System.out.println(result);
	}

	static void printSorted(int[] arr) {

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

//		System.out.println(Arrays.toString(arr));
		String result = "";
		
		for(int i = 0; i< arr.length; i++) {
			result += arr[i] + " ";		
			}
		System.out.println(result);

	}

//	static void printSorted(int[] arr) {
//		Arrays.sort(arr);
//		Arrays.toString(arr);
//		
//	}

	static void printSorted(int[][] arr) {
		for(int x = 0; x < arr.length; x++) {
			for (int i =0; i<arr[x].length-1;i++) {
				for (int j = 0; j< arr[x].length -i-1; j++) {
					if(arr[x][j] > arr[x][j+1]) {
						int temp = arr[x][j];
						arr[x][j] = arr[x][j+1];
						arr[x][j+1] = temp;
					}
				}
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
	}

//	static void printSorted(int[][] arr) {
//
//		int len = 0;
//		for (int[] a : arr) {
//			len += a.length;
//		}
//
//		int[] temporaryArray = new int[len];
//		int index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				temporaryArray[index] = arr[i][j];
//				index++;
//			}
//		}
//
//		for (int i = 0; i < len - 1; i++) {
//			for (int j = 0; j < len - 1 - i; j++) {
//				if (temporaryArray[j] > temporaryArray[j + 1]) {
//					int temp = temporaryArray[j];
//					temporaryArray[j] = temporaryArray[j + 1];
//					temporaryArray[j + 1] = temp;
//				}
//			}
//		}
//		
//		String result = "";
//
//		System.out.println(Arrays.toString(temporaryArray));
//		for(int i = 0; i< temporaryArray.length; i++) {
//			result += arr[i] + " ";		
//			}
//		System.out.println(result);
//
//	}

//	static void printSorted(int[][] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			Arrays.sort(arr[i]);
//		}
//		System.out.println(Arrays.deepToString(arr));
//	}

	public static void main(String[] args) {
		int oneDim[] = { 1, 10, 23, 87, 14, 1, 6, 177, 71 };
		int twoDim[][] = { { 1, 2, 12, 2 }, { 87 }, { 7, 12, 14 }, { 1, 8, 9, 8, } };
		printMaxValue(oneDim);
		printMaxValue(twoDim);
		printMostCommonDigit(oneDim);
		printMostCommonDigit(twoDim);
		printSorted(oneDim);
		printSorted(twoDim);
	}

}
