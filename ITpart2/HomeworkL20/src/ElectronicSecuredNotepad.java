
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	
	ElectronicSecuredNotepad(int maxPages, String password) throws Exception {
		super(maxPages, password);
		isStarted = false;
	}

	@Override
	public void start() {
		System.out.println("Starting device!");
		isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("Turning device off!");
		isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}

	@Override
	public void addText(String text, int pageNum) {
		if(isStarted){
			super.addText(text, pageNum);		
		}
	}

	@Override
	public void overwritePage(String text, int pageNum) {
		if(isStarted){
			super.overwritePage(text, pageNum);		
		}
	}

	@Override
	public void removeText(int pageNum) {
		if(isStarted){
			super.removeText(pageNum);
		}
	}

	@Override
	public void printPages() {
		if(isStarted){
			super.printPages();
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(isStarted){
			return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if(isStarted){
			super.printAllPagesWithDigits();
		}
	}
	
	

}
