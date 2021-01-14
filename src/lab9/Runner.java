package lab9;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		
		//Contructor and toString methods test
		System.out.println("--Constructor and toString methods--");
		Words wrd1 = new Words("Cat Dog Mouse");
		System.out.println("Expected result: Cat Dog Mouse, actual result: " + wrd1);
		String str = null;
		Words wrd2 = new Words(str);
		System.out.println("Expedted result: empty string, actual result: empty string");
		
		//append(String s) method test
		System.out.println();
		System.out.println("--Append method with argument of type String--");
		wrd2.append("Cat Mouse Dog");
		System.out.println("Expected result: Cat Mouse Dog, actual result: " + wrd2);
		
		//Equals method test
		System.out.println();
		System.out.println("--Equals method--");
		System.out.println("Expected result: true, actual result: " + wrd1.equals(wrd2));
		wrd2.append("fish");
		System.out.println("Expected result: false, actual result: " + wrd1.equals(wrd2));
		UniqueWords uwrd = new UniqueWords("Cat Dog Mouse");
		System.out.println("Expected result: false, actual result: " + wrd1.equals(uwrd));
		
		//Clear method test
		System.out.println();
		System.out.println("--Clear method--");
		wrd2.clear();
		System.out.println("Expected result: \"\" , actual result: " + "\"" + wrd2 + "\"");
		
		//append(Words wrd) method test
		System.out.println();
		System.out.println("--Append method with argument of type Words--");
		wrd2.append(wrd1);
		System.out.println("Expected result: Cat Mouse Dog, actual result: " + wrd2);
		
		// String[] maxLenWords() method test
		System.out.println();
		System.out.println("--MaxLenWords method--");
		wrd1.append("Bison");
		wrd1.append("Eagle");
		System.out.println("Expected result: [Mouse, Bison, Eagle], actual result: " + Arrays.toString(wrd1.maxLenWords()));
		
		// String[] minLenWords() method test
		System.out.println();
		System.out.println("--MinLenWords method--");
		wrd1.append("Cow");
		wrd1.append("Bat");
		System.out.println("Expected result: [Cat, Dog, Cow, Bat], actual result: " + Arrays.toString(wrd1.minLenWords()));

		
		//Contructor methods test for UniqueWords
		System.out.println();
		System.out.println("--Constructor and toString methods for UniqueWords--");
		UniqueWords uwrd1 = new UniqueWords("Cat Dog Mouse");
		System.out.println("Expected result: Cat Dog Mouse, actual result: " + uwrd1);
		UniqueWords uwrd2 = new UniqueWords(str);
		System.out.println("Expedted result: \"\", actual result:" +"\""+ uwrd2 + "\"");
		
		//append(String s) method test for UniqueWords
		System.out.println();
		System.out.println("--Append method with argument of type String--");
		uwrd2.append("Cat Mouse Dog");
		System.out.println("Expected result: Cat Mouse Dog, actual result: " + uwrd2);
		
		//append(UniqueWords s) method test for UniqueWords
		System.out.println();
		System.out.println("--Append method with argument of type String--");
		UniqueWords uwrd3 = new UniqueWords("Hamster, Giraffe");
		uwrd2.append(uwrd3);
		System.out.println("Expected result: Cat Mouse Dog Hamster Giraffe, actual result: " + uwrd2);	
		
		//append(Words s) method test for UniqueWords
		System.out.println();
		System.out.println("--Append method with argument of type String--");
		Words wrd3 = new Words("Elephant, Giraffe");
		uwrd2.append(wrd3);
		System.out.println("Expected result: Cat Mouse Dog Hamster Giraffe Elephant, actual result: " + uwrd2);
		
		//common(String  s) method test for UniqueWords
		System.out.println();
		System.out.println("--common(String s) method--");
		String s = "Dog Elephant";
		System.out.println("Expected result: Dog Elephant, actual result: " + uwrd2.common(s));
		
		//common(UniqueWords  s) method test for UniqueWords
		System.out.println();
		System.out.println("--common(String s) method--");
		System.out.println("Expected result: Cat Dog Mouse, actual result: " + uwrd2.common(uwrd1));
		
		//common(String  s) method test for UniqueWords
		System.out.println();
		System.out.println("--common(String s) method--");
		wrd1.append("Giraffe");
		System.out.println("Expected result: Cat Dog Mouse Giraffe , actual result: " + uwrd2.common(wrd1));

		//Equals method
		System.out.println();
		System.out.println("--Equals method--");
		uwrd1.clear();
		uwrd1.append("Dog Cat");
		uwrd2.clear();
		uwrd2.append("Cat Dog");
		System.out.println("Expected result: true, actual result: " + uwrd1.equals(uwrd2));
		uwrd2.append("Fish");
		System.out.println("Expected result: false, actual result: " + wrd1.equals(wrd2));
		wrd1.clear();
		wrd1.append("Dog Cat");
		System.out.println("Expected result: false, actual result: " + wrd1.equals(uwrd));
		
		
		
		
	}

}
