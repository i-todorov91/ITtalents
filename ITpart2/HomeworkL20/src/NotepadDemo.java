
public class NotepadDemo {

	public static void main(String[] args) throws Exception {
		
		Page stranica = new Page("Chapter 1", "This is the book of Eden.");
		SimpleNotepad tetradka = new SimpleNotepad(30);
		SecuredNotepad tefter = new SecuredNotepad(30, "qweR1");
		
		for (int i = 0; i < tetradka.getPages().length; i++) {
			tetradka.getPages()[i].setTitle("Chapter " + (i + 1));
			tetradka.getPages()[i].addText("text " + (i + 1));	
		}
		tetradka.printPages();
		System.out.println(tetradka.searchWord("text"));
		
		for (int i = 0; i < 2; i++) {
			tefter.getPages()[i].setTitle("Secured Chapter " + i);
			tefter.getPages()[i].addText("Secured text " + i);
		}
		tefter.printAllPagesWithDigits();
		
		tetradka.removeText(30);
		tetradka.overwritePage("neshto si", 29);
		tetradka.printPages();

		System.out.println(tefter.searchWord("all"));
		System.out.println(tefter.searchWord("text"));
		
		
	}
}
