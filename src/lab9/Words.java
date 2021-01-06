package lab9;

import java.util.Arrays;

public class Words {

	private String word;
	
	public Words(String arg) {
		if(arg ==null)
			this.word = "";
		else
			this.word = arg;
	}
	
	public String getWord() {
		return word;
	}

	public boolean equals(Object ob) {
		if(ob == this)
			return true;
		if(ob == null)
			return false;
		if(ob.getClass() != getClass())
			return false;
		Words wrd = (Words)ob;
		String[] arr1 = word.split("[\\s\\.?!:,]+");
		String[] arr2 = wrd.getWord().split("[\\s\\.?!:,]+");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	@Override
	public String toString() {
		return word;
	}

	public void clear() {
		word = "";
	}
	
	public void append(String s) {
		if(word.toString() == "")
			word = s;
		else 
			word = word + " " +  s;
	}
	
	public void append (Words wrd) {
		if(word.toString() == "")
			word = wrd.toString();
		else
			word = word + " " +  wrd.toString();
	}
	
	public String[] maxLenWords() {
		int maxLen = getMaxLength();
		String ar[] = word.split("[\\s\\.?!:,]+");
		String result = "";
		for(String s: ar) {
			if(s.length() == maxLen)
				result += s + " ";
			}
		return result.split("[\\s\\.?!:,]+");
		}
	
	public String[] minLenWords() {
		int minLen = getMinLength();
		String ar[] = word.split("[\\s\\.?!:,]+");
		String result = "";
		for(String s: ar) {
			if(s.length() == minLen)
				result += s + " ";
			}
		return result.split("[\\s\\.?!:,]+");
		}
	
	private int getMaxLength() {
		int maxLen = 0;
		String ar[] = word.split("[\\s\\.?!:,]+");
		for(String s: ar) {
			if (s.length() > maxLen) {
				maxLen = s.length();
			}
		}
		return  maxLen;
	}
	
	private int getMinLength() {
		int minLen = Integer.MAX_VALUE;
		String ar[] = word.split("[\\s\\.?!:,]+");
		for(String s: ar) {
			if (s.length() < minLen) {
				minLen = s.length();
			}
		}
		if( minLen == Integer.MAX_VALUE)
			return 0;
		return  minLen;
	}
}
