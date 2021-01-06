package additionalTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Nostromo {

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
	
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner file = new Scanner(new File("Nostromo.txt"));
//		PrintWriter writer = new PrintWriter("F:\\programming\\clipse-workspace\\Laboratories\\Nostromo2");
//		
//		 while (file.hasNext()) {
//             String line = file.nextLine();
//             
//             if (!line.isEmpty()) {
//                 writer.write(line);
//                 writer.write("\n");
//             }
//         }
//		 file.close();
//         writer.close();
         
		Scanner fileTxt = new Scanner(new File("Nostromo.txt"));
         File file = new File("Nostromo3");
//         System.out.println(fileTxt.length());
         int counter = 0;
         while (fileTxt.hasNext()) {
             String line = fileTxt.nextLine();
             line = line.toLowerCase();
             for(int i = 0; i<line.length(); i++) {
            	 char c=line.charAt(i);
            	 int ascii = (int) c;
            	 if((ascii > 96 && ascii < 123) || (ascii >64 && ascii < 91)) {
            		 counter++;
            	 }
             }
         }
//             String result[] = line.split("");
//             for (String s: result ) {
//            	 s = s.toLowerCase();
//            	 char x = Character.valueOf(s);
//            	 int ascii = (int) character;
//            	 if(ascii < 96 && ascii > 122) {
//            		 counter++;
//            	 }
//            	 
//             }
             System.out.println(file.length());
             System.out.println(file.length() - counter);
             
	}

}
