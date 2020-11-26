package additionalTasks;


public class MaxArrayLength {

	
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		
		
		// I've calculated before that one element one element of array takes 4 bytes
		long totalMemory = runtime.totalMemory();
		long freeMemory = runtime.freeMemory();
		long maxMemory = runtime.maxMemory();
		System.out.println(totalMemory);
		System.out.println(freeMemory);
		System.out.println(maxMemory);
		long memory = runtime.totalMemory() - runtime.freeMemory();
		long total = (maxMemory-memory)/4;
		int index= (int)total;
		System.out.println("Max number of elements is: " + total);
		System.out.println(total);
		System.out.println(Integer.MAX_VALUE/2);
		
	}


}
