import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecureNotepad {

	private String password;
	private Scanner sc = new Scanner(System.in);
	
	SecuredNotepad(int maxPages, String password) throws Exception {
		super(maxPages);
		if (!password.matches(PASSWORD_REGEX)) {
			throw new Exception("Weak password!");
		} else {
			this.password = password;
		}
	}

	private boolean validatePass() {
		System.out.println();
		System.out.println("Enter Password:");
		if (this.password.equals(sc.next())) {
			System.out.println("Correct!");
			System.out.println();
			return true;
		}
		System.out.println("Incorrect!");
		System.out.println();
		return false;
	}

	@Override
	public void addText(String text, int pageNum) {
		if (validatePass()) {
			super.addText(text, pageNum);
		}
	}

	@Override
	public void overwritePage(String text, int pageNum) {
		if (validatePass()) {
			super.overwritePage(text, pageNum);
		}		
	}

	@Override
	public void removeText(int pageNum) {
		if (validatePass()) {
			super.removeText(pageNum);
		}	
	}

	@Override
	public void printPages() {
		if (validatePass()) {
			super.printPages();
		}	
	}

	@Override
	public boolean searchWord(String word) {
		if (validatePass()) {
			if (super.searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (validatePass()) {
			super.printAllPagesWithDigits();
		}
	}

}
