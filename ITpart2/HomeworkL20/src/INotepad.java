
public interface INotepad {

	void addText(String text, int pageNum);
	void overwritePage(String text, int pageNum);
	void removeText(int pageNum);
	void printPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
	
}
