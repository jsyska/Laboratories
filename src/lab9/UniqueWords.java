package lab9;

import java.util.Arrays;

public class UniqueWords extends Words{

	public UniqueWords(String arg) {
		super(arg);
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == this)
			return true;
		if(ob == null)
			return false;
		if(ob.getClass() != getClass())
			return false;
		UniqueWords wrd = (UniqueWords)ob;
		String[] arr1 = getWord().split("[\\s\\.?!:,]+");
		String[] arr2 = wrd.getWord().split("[\\s\\.?!:,]+");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	public boolean isUnique(String s) {
		String ar[] = getWord().split("[\\s\\.?!:,]+");
		for(String wrd: ar) {
			if(wrd.equals(s))
				return false;
		}
		return true;
	}
	

	@Override
	public void append(String s) {
		if(isUnique(s)) {
			super.append(s);
		}
		
	}

	@Override
	public void append(Words wrd) {
		String ar[] = wrd.getWord().split("[\\s\\.?!:,]+");
		String[] uniqueWords = getWord().split("[\\s\\.?!:,]+");
		for(String word: ar) {
			if(Arrays.asList(uniqueWords).contains(word)) {
				continue;
				}
			super.append(word);
			}
	}
	
	
	public void append(UniqueWords uwds) {
		String ar[] = uwds.getWord().split("[\\s\\.?!:,]+");
		String[] uniqueWords = getWord().split("[\\s\\.?!:,]+");
		for(String word: ar) {
			if(Arrays.asList(uniqueWords).contains(word)) {
				continue;
				}
			super.append(word);
			}
	}
	
	private String getUniqueWords(String s) {
		String[] words = s.split("[\\s\\.?!:,]+");
		String commonWords = "";
		String[] currentWords = getWord().split("[\\s\\>?!:,]+");
		for (String wrd : words) {
			if(Arrays.asList(currentWords).contains(wrd)) {
				commonWords += wrd + " "; 
			}
		}
		return commonWords;
	}
	
	public UniqueWords common(String s) {
		return new UniqueWords(getUniqueWords(s));
	};
	public UniqueWords common(UniqueWords uwds) {
		return new UniqueWords(getUniqueWords(uwds.getWord()));
	};
	public UniqueWords common(Words wds) {
		return new UniqueWords(getUniqueWords(wds.getWord()));
	};

}
