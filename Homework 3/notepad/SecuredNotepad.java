package notepad;

import java.util.Scanner;
//import java.util.regex.*;

public class SecuredNotepad extends SimpleNotepad{

	protected String password;
	
	public SecuredNotepad(int numberPages, String password) {
		super(numberPages);
		String regexPass = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=\\S+$).{5,}";
		if(password.matches(regexPass)){
			this.password = password;
		}
		else{
			System.out.println("The password must have at least 5 symbols, at least one lower case, at least one upper case and at least one number.");
		}
	}
	
	boolean askForPassword(String password){
	
		System.out.println("Please enter a password: ");
		
		Scanner sc = new Scanner(System.in);
		password = sc.next();
		String regexPass = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=\\S+$).{5,}";
		
		if(this.password.equals(password) && password.matches(regexPass)){
			return true;
		}		
		return false;
		
	}
	
	@Override
	public void addText(int pageNumber, String text){
		if(askForPassword(password)){
			super.addText(pageNumber, text);
		}
		else{
			System.out.println("Wrong password.");
		}
	}
	
	@Override
	public void addTitle(int pageNumber, String title) {
		if(askForPassword(password)){
			super.addTitle(pageNumber, title);
		}
		else{
			System.out.println("Wrong password.");
		}
	}
	
	@Override
	public void deleteText(int pageNumber) {
		if(askForPassword(password)){
			super.deleteText(pageNumber);
		}
		else{
			System.out.println("Wrong password.");
		}
	}
	
	@Override
	public void deleteTitle(int pageNumber) {
		if(askForPassword(password)){
			super.deleteTitle(pageNumber);
		}
		else{
			System.out.println("Wrong password.");
		}
	}
	
	@Override
	public void addTextNew(int pageNumber, String text) {
		if(askForPassword(password)){
			super.deleteText(pageNumber);
			super.addText(pageNumber, text);
		}
		else{
			System.out.println("Wrong password.");
		}
	}

	
	@Override
	public void lookText() {
		if(askForPassword(password)){
			super.lookText();
		}
		else{
			System.out.println("Wrong password.");
		}
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(askForPassword(password)){
			super.printAllPagesWithDigits();
		}
		else{
			System.out.println("Wrong password.");
		}
	}
	
	@Override
	public void searchWord(String word) {
		if(askForPassword(password)){
			super.searchWord(word);
		}
		else{
			System.out.println("Wrong password.");
		}
	}	
	
}
