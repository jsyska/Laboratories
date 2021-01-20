package bluePrint;

public class HierarchyTag implements Tags {
	protected String tag = null;
	
	public HierarchyTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public void setTag(String str) {
		this.tag = str;
		
	}

	@Override
	public boolean isMatching(Tags sec) {
		HierarchyTag tag2 = (HierarchyTag) sec;
		if(tag == null || tag2 == null)
			return true;
		String[] tags1 = tag.split(";");
		String[] tags2 = tag2.tag.split(";");
		return(tags1[0].trim().equals(tags2[0].trim()) && tags1[1].trim().equals(tags2[1].trim()));
		
	}
	
	@Override
	public String toString() {
		return "HierarchyTag: " + tag;
	}
	
	

}
