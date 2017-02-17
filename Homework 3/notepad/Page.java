package notepad;

public class Page {
	
	private String title;
	private String text;
	private int pageNumber;
	
	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public Page(String title, String text, int pageNumber) {
		if(title != null){
			this.title = title;
		}
		if(text != null){
			this.text = text;
		}
		if(pageNumber > 0){
			this.pageNumber = pageNumber;
		}
	}

	public void addText(String text){
		this.text = this.text + text;
	}
	
	public void addTitle(String title){
		this.title = title;
	}
	
	public void deleteText(){
		this.text = "";
	}
	
	public void deleteTitle(){
		this.title = "";
	}
	
	public void lookPage(){
		System.out.println("Page number: " + this.pageNumber);
		System.out.println("The title is: " + this.title);
		System.out.println("The text is: " + this.text);
	}
	
	public boolean searchWord(String word){
		String[] words = text.split(" ");
//		boolean findWord = false;
//		int index = 0;
		
		for(int i = 0; i < words.length; i++){
			if(words[i].equals(word)){
//				findWord = true;
//				index = i;
//				break;
				return true;
			}
		}
		
		return false;
		
//		if(findWord){
//			System.out.println("The word '" + words[index] + "' is found on this page.");
//		}
//		else{
//			System.out.println("The word '" + word + "' is NOT fount on this page.");
//		}
		
	}
	
	boolean containsDigits(){
		String[] words = text.split(" ");
		
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].length(); j++){
				if(words[i].charAt(j) >= 48 && words[i].charAt(j) <= 57){
					return true;
				}
			}
		}		
		return false;
	}

}
