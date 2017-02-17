package notepad;

public interface INotepad {

	void addText(int pageNumber, String text);
	
	void addTitle(int pageNumber,String title);
	
	void addTextNew(int pageNumber, String text);
	
	void deleteText(int pageNumber);
	
	void deleteTitle(int pageNumber);
	
	void lookText();
	
	void searchWord(String word);
	
	void printAllPagesWithDigits();

}
