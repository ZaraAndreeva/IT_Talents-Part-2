package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice{
	
	private boolean isStarted = true;

	public ElectronicSecuredNotepad(int numberPages, String password) {
		super(numberPages, password);
	}

	@Override
	public void start() {
		if(askForPassword(password)){
			System.out.println("The Electronic Secured Notepad is started.");
			isStarted = true;
		}
	}

	@Override
	public void stop() {
		if(askForPassword(password)){
			System.out.println("The Electronic Secured Notepad is stopped.");
			isStarted = false;
		}
	}

	@Override
	public boolean isStarted() {
		if(isStarted){
			return true;
		}
		return false;
	}
	
	@Override
	boolean askForPassword(String password) {
		return super.askForPassword(password);
	}
	
	
	@Override
	public void addText(int pageNumber, String text) {
		if(isStarted()){
			super.addText(pageNumber, text);
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void addTextNew(int pageNumber, String text) {
		if(isStarted()){
			super.addTextNew(pageNumber, text);
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void addTitle(int pageNumber, String title) {
		if(isStarted()){
			super.addTitle(pageNumber, title);
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void deleteText(int pageNumber) {
		if(isStarted()){
			super.deleteText(pageNumber);
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void deleteTitle(int pageNumber) {
		if(isStarted()){
			super.deleteTitle(pageNumber);
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void lookText() {
		if(isStarted()){
			super.lookText();
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(isStarted()){
			super.printAllPagesWithDigits();
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	@Override
	public void searchWord(String word) {
		if(isStarted()){
			super.searchWord(word);
		}
		else{
			System.out.println("The Electronic Secured Notepad is stopped.");
		}
	}
	
	
	
}
