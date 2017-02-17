package notepad;

public class NotepadDemo {

	public static void main(String[] args) {
		
		SimpleNotepad newNotepad = new SimpleNotepad(5);	
		newNotepad.addText(1, "This text has been added");
		newNotepad.addTitle(1, "Lesson 20");
		newNotepad.lookText();
		newNotepad.deleteText(1);
		newNotepad.deleteTitle(1);
		newNotepad.addText(2, "First solve the problem and then write the code. ");
		newNotepad.addTextNew(1, "In order to understand recursion, one must first understand recursion.");
		newNotepad.addText(2, "A good programmer is someone who always looks both ways before crossing a 1-way street");
		newNotepad.lookText();
		newNotepad.searchWord("programmer");
		System.out.println();
		newNotepad.printAllPagesWithDigits();
		
//		SecuredNotepad notepad = new SecuredNotepad(4,"ITTalents7");
//		notepad.addText(2, "Season 7, Java 1");
//		notepad.addTitle(2, "Training camp");
//		notepad.addTitle(3, "Part 2");
//		notepad.addText(3, "Object-oriented programming");
//		notepad.lookText();
		
//		ElectronicSecuredNotepad notepad = new ElectronicSecuredNotepad(3, "GroupJava1");
//		notepad.addText(2, "Java Enterprise Edition");
//		notepad.addTitle(1, "IT Talents");
//		notepad.lookText();
//		notepad.stop();
//		notepad.lookText();
//		notepad.start();
//		notepad.addText(3,"The task is done");
//		notepad.lookText();
		
	}

}
