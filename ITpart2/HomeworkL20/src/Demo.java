
public class Demo {

	public static void main(String[] args) throws Exception {
		
		ElectronicSecuredNotepad iPod = new ElectronicSecuredNotepad(30, "qweR1");
		for (int i = 0; i < iPod.getMaxPages(); i++) {
			iPod.getPages()[i].setTitle("Chapter " + (i + 1));
		}
		iPod.start();
		iPod.addText("Malko textche", 2);
		iPod.printPages();
		iPod.overwritePage("poveche text", 2);
		iPod.printPages();
		System.out.println(iPod.isStarted());
		iPod.stop();
		
	}
}
