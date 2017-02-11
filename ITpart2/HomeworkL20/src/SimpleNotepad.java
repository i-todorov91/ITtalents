
public class SimpleNotepad implements INotepad {
	
	private Page[] pages;
	private int maxPages;
	
	SimpleNotepad(int maxPages){
		if (maxPages > 0) {
			this.maxPages = maxPages;
			this.pages = new Page[maxPages];
			for (int i = 0; i < pages.length; i++) {
				this.pages[i] = new Page();
			}
		}
	}
	
	public Page[] getPages(){
		return pages;
	}
	
	public int getMaxPages(){
		return maxPages;
	}
	
	@Override
	public void addText(String text, int pageNum) {
		if (valTP(text, pageNum)) {
			this.pages[pageNum - 1].addText(text);
		}
	}

	@Override
	public void overwritePage(String text, int pageNum) {
		if (valTP(text, pageNum)) {
			this.pages[pageNum - 1].setText(text);;
		}
	}

	@Override
	public void removeText(int pageNum) {
		if (valP(pageNum)) {
			this.pages[pageNum - 1].setText("");
		}
	}

	@Override
	public void printPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println("Page " + (i + 1));
			pages[i].printPage();
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (word != null && !word.isEmpty()) {
			for (int i = 0; i < pages.length; i++) {
				if (this.pages[i].searchWord(word)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits()) {
				pages[i].printPage();
			}
		}
	}
	
	private boolean valP(int pageNum){
		if (pageNum > 0 && pageNum <= maxPages) {
			return true;
		}
		return false;
	}
	private boolean valT(String text){
		if (text != null) {
			return true;
		}
		return false;
	}
	
	private boolean valTP(String text, int pageNum){
		if (valT(text) && valP(pageNum)) {
			return true;
		}
		return false;
	}

}
