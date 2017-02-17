import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter some text: ");
		String text = sc.nextLine();
		HashMap<Character, Integer> commonLetters = new HashMap<>();
		
		for(int i = 0; i < text.length(); i++){
			int count = 0;
			for(int j = 0; j < text.length(); j++){
				if(text.toUpperCase().charAt(i) >= 'A' && text.toUpperCase().charAt(i) <= 'Z'){
					char symbol = text.toUpperCase().charAt(i);
					if(symbol == text.toUpperCase().charAt(j)){
						count++;
					}
				}
			}
			if(text.toUpperCase().charAt(i) >= 'A' && text.toUpperCase().charAt(i) <= 'Z'){
				commonLetters.put(text.toUpperCase().charAt(i), count);
			}
		}
		
		ArrayList<Entry<Character, Integer>> print = new ArrayList<>();
		
		for (Entry<Character, Integer> entry : commonLetters.entrySet()) {
			print.add(entry);
		}
		
		Comparator<Entry<Character, Integer>> c = new Comparator<Entry<Character, Integer>>() {
			
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		};
		
		Collections.sort(print, c);
		
		double max = print.get(0).getValue();
		
		for(int i = 0; i < print.size(); i++){
			System.out.print(print.get(i) + " ");
			double num = (print.get(i).getValue() / max) * 20.0;
			for(int j = 0; j < num; j++){
				System.out.print("#");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
