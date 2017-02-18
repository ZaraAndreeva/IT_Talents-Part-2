package musicShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

import musicInstruments.MusicInstrument;

public class MusicShop {
	
	public enum MusicInstruments {DUHOVI, ELEKTRONNI, KLAVISHNI, STRUNNI, UDARNI}

	private double moneyInShop;
	private TreeMap<MusicInstruments, ArrayList<MusicInstrument>> katalog;
	private TreeMap<MusicInstrument, Integer> prodajbi;
	
	public MusicShop() {
		katalog = new TreeMap<>();
		katalog.put(MusicInstruments.DUHOVI, new ArrayList<>());
		katalog.put(MusicInstruments.ELEKTRONNI, new ArrayList<>());
		katalog.put(MusicInstruments.STRUNNI, new ArrayList<>());
		katalog.put(MusicInstruments.KLAVISHNI, new ArrayList<>());
		katalog.put(MusicInstruments.UDARNI, new ArrayList<>());
		
		prodajbi = new TreeMap<>(new Comparator<MusicInstrument>() {
			@Override
			public int compare(MusicInstrument o1, MusicInstrument o2) {
				if(o1.getBroiProdajbi() == o2.getBroiProdajbi()){
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getBroiProdajbi() - o2.getBroiProdajbi();
			}
		});
	}

	public void addInstruments(MusicInstrument instr){
		System.out.println("--------------------------------------------------------------------------");
		katalog.get(instr.getType()).add(instr);
		System.out.println("You just added " + instr.getCapacity() + " of " + instr.getType() + " instruments.");
		System.out.println("The capacity of all " + instr.getType() +" now is " + instr.getCapacity() + ".");
	}

	public void sellInstrument(MusicInstrument instr, int capacity){	
		
		boolean isInstrInArray = false;
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			if(e.getValue().contains(instr)){
				isInstrInArray = true;
				break;
			}
		}
		
		if(isInstrInArray){  
			if(capacity > instr.getCapacity()){
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("There are not that much number of instruments.");
				return;
			}
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("You bought " + capacity + " pieces of " + instr.getName() + " for " + instr.getPrice() + " for each.");
			this.moneyInShop += instr.getPrice() * capacity;
			instr.setCapacity(instr.getCapacity() - capacity);
			instr.addProdajbi(capacity);
			
			if(prodajbi.containsKey(instr)){
				int newProdajbi = prodajbi.get(instr) + capacity;
				prodajbi.put(instr, newProdajbi);
			}
			else{
				prodajbi.put(instr, capacity);
			}
		}
		else{
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("There isn't an instrument with that name!");
		}
			
	}

	public void printListWithInstruments(){
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("List with all instruments ordered by type and name: ");
		
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			Collections.sort(e.getValue(), new Comparator<MusicInstrument>() {
				@Override
				public int compare(MusicInstrument o1, MusicInstrument o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
		}
		printKatalog();
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("List with all instruments ordered by price: ");
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			Collections.sort(e.getValue(), new Comparator<MusicInstrument>() {
				@Override
				public int compare(MusicInstrument o1, MusicInstrument o2) {
					if(o1.getPrice() > o2.getPrice()){
						return 1;
					}
					if(o1.getPrice() < o2.getPrice()){
						return -1;
					}
					return o1.getName().compareTo(o2.getName());
				}
			});
		}
		printKatalog();
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("List with all instruments that are in stock in the shop: ");
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			System.out.println(e.getKey()  + " : ");
			int capacity = 0;
			for (MusicInstrument i : e.getValue()) {
				if(i.getCapacity() <= 0){
					continue;
				}
				System.out.println("   " + i);
				capacity += i.getCapacity();
			}
			System.out.println("     Capacity: " + capacity);
		}
		
	}
	
	public void spravkiZaRabota(){
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		for (Entry<MusicInstrument, Integer> e : prodajbi.entrySet()) {
			System.out.println(e.getKey());
			System.out.println("Number of sales: " + e.getValue());
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The sum of all sold instruments: " + this.moneyInShop);
		System.out.println("--------------------------------------------------------------------------");
		int max = 0;
		for (Entry<MusicInstrument, Integer> e : prodajbi.entrySet()) {
			if(max < e.getValue()){
				max = e.getValue();
			}
		}
		System.out.print("The instrument that are the most sellable: " );
		for (Entry<MusicInstrument, Integer> e : prodajbi.entrySet()) {
			if(e.getValue().equals(max)){
				System.out.println(e.getKey());
			}
		}
		System.out.println("Number of sold instruments that are most sellable: " + max);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("All the instruments that noone ever bought. ");
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			System.out.println(e.getKey()  + " : ");
			for (MusicInstrument i : e.getValue()) {
				if(prodajbi.containsKey(i)){
					continue;
				}
				System.out.println("   " + i);
			}
		}
		System.out.println("--------------------------------------------------------------------------");
		double maxSum = 0;
		for (Entry<MusicInstrument, Integer> e : prodajbi.entrySet()) {
			if(maxSum < e.getKey().getPrice() * e.getValue()){
				maxSum = e.getKey().getPrice() * e.getValue();
			}
		}
		System.out.println("The instrument that the shop has the highest income (biggest sum from sales): " );
		for (Entry<MusicInstrument, Integer> e : prodajbi.entrySet()) {
			if(e.getValue().equals((int)(maxSum / e.getKey().getPrice()))){
				System.out.println(e.getKey());
			}
		}
		System.out.println("The sum of all sold number of this instrument: " + maxSum);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Info for all instruments that are most sellable by type (the highest sells from type): ");
		int prodajbiPoVid = 0;
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			for (MusicInstrument i : e.getValue()) {
				if(prodajbiPoVid < i.getBroiProdajbi()){
					prodajbiPoVid = i.getBroiProdajbi();
				}
			}
		}
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			System.out.println(e.getKey()  + " : ");
			for (MusicInstrument i : e.getValue()) {
				if(prodajbiPoVid != i.getBroiProdajbi()){
					continue;
				}
				System.out.println("   " + i);
				System.out.println("         Number of sold instruments: " + prodajbiPoVid);
				break;
			}
		}
		
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public void printKatalog(){
		System.out.println("--------------------------------------------------------------------------");
		for (Entry<MusicInstruments, ArrayList<MusicInstrument>> e : katalog.entrySet()) {
			System.out.println(e.getKey()  + " : ");
			int capacity = 0;
			for (MusicInstrument i : e.getValue()) {
				System.out.println("   " + i);
				capacity += i.getCapacity();
			}
			System.out.println("     Capacity: " + capacity);
		}
		
	}
	
}