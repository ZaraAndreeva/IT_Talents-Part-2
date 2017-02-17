package notepad;

public class SimpleNotepad implements INotepad{
	
	protected int numberPages;
	protected Page[] pages;
	
	public SimpleNotepad(int numberPages) {
		if(numberPages > 0){
			this.numberPages = numberPages;
		}
		else{
			System.out.println("You entered invalid number for pages.");
			System.out.println("Your notepad will be with default pages.");
			this.numberPages = 10;
		}
		
		pages = new Page[numberPages];
		for(int i = 0; i < pages.length; i++){
			pages[i] = new Page("" , "" , i+1);			
		}
	}

	@Override
	public void addText(int pageNumber, String text) {
		pages[pageNumber - 1].addText(text);
	}

	@Override
	public void addTextNew(int pageNumber, String text) {
		pages[pageNumber - 1].deleteText();
		pages[pageNumber - 1].addText(text);
	}

	@Override
	public void deleteText(int pageNumber) {
		pages[pageNumber - 1].deleteText();
	}

	@Override
	public void lookText() {
		for(int i = 0; i < pages.length; i ++){
			pages[i].lookPage();
			System.out.println();
		}
	}

	@Override
	public void addTitle(int pageNumber, String title) {
		pages[pageNumber - 1].addTitle(title);
	}

	@Override
	public void deleteTitle(int pageNumber) {
		pages[pageNumber - 1].deleteTitle();		
	}
	
	@Override
	public void searchWord(String word) {
		boolean hasWord = false;
		
		for(int i = 0; i < pages.length; i++){
			if(pages[i].searchWord(word)){
				hasWord = true;
				break;
			}
		}
		if(hasWord){
			System.out.println("The word '" + word + "' is found in the text.");
		}
		else{
			System.out.println("The word '" + word + "' is NOT fount in the text.");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("All pages that contain digits: ");
		for(int i = 0; i < pages.length; i++){
			if(!pages[i].containsDigits()){
				continue;
			}
			pages[i].lookPage();
		}
	}
	
}
