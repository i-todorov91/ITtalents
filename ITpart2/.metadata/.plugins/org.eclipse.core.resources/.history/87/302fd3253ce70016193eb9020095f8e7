
public class Page {

	private String title;
	private String text;
	
	Page(){
		this.title = "";
		this.text = "";
	}
	
	Page(String title, String text){
		if (title != null && text != null) {
			this.title = title;
			this.text = text;
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		}
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addText(String text){
		if (text != null) {
			this.text = this.text.concat(text);
		}
	}
	
	public void deleteText(){
		this.text = "";
	}
	
	public void printPage(){
		System.out.println(this.title);
		System.out.println(this.text);
		System.out.println();
	}
	
	public boolean searchWord(String word){
		String[] words = this.text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsDigits(){
		for (int i = 0; i < this.text.length(); i++) {
			if (this.text.charAt(i) >= 0 || this.text.charAt(i) <= 9) {
				return true;
			}
		}
		return false;
	}
	
}
