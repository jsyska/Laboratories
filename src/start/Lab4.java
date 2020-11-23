package start;
import java.util.Arrays;


public class Lab4{
	public static void main(String[] args) {
		ArrayPack ap = new ArrayPack();
		int[] arr = ArrayPack.readArray(4);
		System.out.println(Arrays.toString(arr));
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {6,7,8,9,10};
		int[] a3 = ArrayPack.appendArrays(a1, a2);
		System.out.println();
		System.out.println("Append arrays");
		System.out.println(Arrays.toString(a3));
		System.out.println();
		
		int[] a4 = {4,2,6,18,23,25,65,3};
		int minfromA4 = ap.getMinimalElement(a4);
		System.out.println("Minimal element: " + minfromA4);
		
		System.out.println();
		int[] a5 = {2,3,1,1,4,2,6,18,23,25,65,3};
		int[] minimalElementsFroma5 = ap.getMinimalElements(a5);
		System.out.println("Minimal elements: " + Arrays.toString(minimalElementsFroma5));
	
		System.out.println();
		int[] a6 = {2,1,5,7,13,22,67,3,7,21,65,34,14,18,24, 19, 20};
		int limit = 19;
		System.out.println("Get greater than: " + limit);
		int[] greaterThanLimit = ap.getGreaterThan(a6, limit);
		System.out.println(Arrays.toString(greaterThanLimit));
		
		System.out.println();
		int[] a7 = {2,1,5,7,13,22,67,3,7,21,65,34,14,18,24, 19, 20, 57, 55,89,111};
		int lowerLimit = 11;
		int upperLimit = 49;
		System.out.println("In range from " + lowerLimit + " to " + upperLimit);
		int[] arrayInRange = ap.getRange(a7, lowerLimit, upperLimit);
		System.out.println(Arrays.toString(arrayInRange));
		
		System.out.println();
		int[] a8 = {1,4,2,5,7,44,2,3,4,6,2,4,2,5,6,9,99,2,14,2,152,2};
		int what2Look4 = 2;
		System.out.println("How many " + what2Look4 + " in array: " + ap.elementCount(a8, what2Look4));
		
		System.out.println();
		int[] a9 = {1,3,5,6,7,8,9,13,10,11,12,15,17,18};
		int[] a10 = {2,4,6,8,10,12,14,16,18};
		System.out.println("Alements that are in both arrays:");
		int[] commonEelements = ArrayPack.commonElements(a9, a10);
		System.out.println(Arrays.toString(commonEelements));
		
		System.out.println();
		int[] uniqueElements = ArrayPack.uniqueElements(a9,a10);
		System.out.println("Elements that are unique: ");
		System.out.println(Arrays.toString(uniqueElements));
		
		System.out.println();
		int[] arrayToFill = new int[20];
		int fillValue = 7;
		ArrayPack.fillWith(arrayToFill, fillValue);
		System.out.println("Array has been filled with: " + fillValue);
		System.out.println(Arrays.toString(arrayToFill));
		
		System.out.println();
		int[] arrToReverse = {1,2,3,4,5,6};
		ArrayPack.reverseMe(arrToReverse);
		System.out.println("Reversed array: ");
		System.out.println(Arrays.toString(arrToReverse));
		
		System.out.println();
		int[] arrToReverse2 = {1,2,3,4,5,6};
		int[] reversedArray =ArrayPack.returnReversed(arrToReverse2);
		System.out.println("Returned reversed array: ");
		System.out.println(Arrays.toString(reversedArray));
		
		System.out.println();
		int[][] arr11 = {{5,44,32,121,22,2}, {12,141,24,254,56,44,21}, {11,11,12,15,7,7}};
		System.out.println("Minimal values from each row of two dimensional array: ");
		System.out.println(Arrays.toString(ArrayPack.getMinimals(arr11)));
	}

}
