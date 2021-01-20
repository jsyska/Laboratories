package bluePrint;

public class Item {

	private String content;
	private TermBagTag bTag;
	private HierarchyTag hTag;
	
	public Item(String cont, TermBagTag tb, HierarchyTag t2) {
		this.content = cont;
		this.bTag =tb;
		this.hTag = t2;
	}
	public Item(String cont, String sb, String t2) {
		this.content = cont;
		this.bTag = new TermBagTag(sb);
		this.hTag = new HierarchyTag(t2);
	}
	
	public String getContent() {
		return content;
	}
	public TermBagTag getbTag() {
		return bTag;
	}
	public HierarchyTag gethTag() {
		return hTag;
	}
	@Override
	public String toString() {
		 return "Content: " + content + "\n" + bTag.toString() + "\n" + hTag.toString();
	}
	
	public boolean isMatching(Item sec) {
		return (this.bTag.isMatching(sec.getbTag())) && (this.hTag.isMatching(sec.gethTag()));
	}
}
