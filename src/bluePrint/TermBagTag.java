package bluePrint;

import java.util.Arrays;

public class TermBagTag implements Tags{
	
	protected String tag = null;
	
	public TermBagTag(String tag) {
		this.tag = tag;
	}

	@Override
	public void setTag(String str) {
		this.tag = str;
	}

	@Override
	public boolean isMatching(Tags sec) {
		TermBagTag tag2 = (TermBagTag) sec;
		if(tag == null || tag2 == null)
			return true;
		String[] tags1 = tag.split("[;\\s]+");
		String[] tags2 = tag2.tag.split("[;\\s]+");
		removeSpaces(tags1);
		removeSpaces(tags1);
		for(String s: tags1) {
			if(!Arrays.asList(tags2).contains(s))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TermBagTag: " + tag;
	}
	
	private void removeSpaces(String[] tags) {
		for(String s:tags) {
			s = s.trim();
		}
	}
	
}
