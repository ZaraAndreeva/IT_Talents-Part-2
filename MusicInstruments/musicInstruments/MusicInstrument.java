package musicInstruments;

import musicShop.MusicShop.MusicInstruments;

public abstract class MusicInstrument {
	
	private String name; 
	private double price;
	private int capacity;
	protected IMusicInstruments instruments;
	protected MusicInstruments type;
	private int broiProdajbi;

	public MusicInstrument(IMusicInstruments instr, MusicInstruments type, String name, double price, int capacity) {
		this.instruments = instr;
		this.type = type;
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		if(price > 0){
			this.price = price;
		}
		if(capacity > 0){
			this.capacity = capacity;
		}
		this.broiProdajbi = 0;
	}
	
	public int getBroiProdajbi() {
		return broiProdajbi;
	}
	
	public void addProdajbi(int prodajbi){
		if(prodajbi > 0){
			this.broiProdajbi += prodajbi;
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public MusicInstruments getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setCapacity(int capacity) {
		if(capacity > 0){
			this.capacity = capacity;
		}
	}

	@Override
	public String toString() {
		return "MusicInstrument [name=" + name + ", price=" + price + ", capacity=" + capacity + ", instruments="
				+ instruments + ", type=" + type + "]";
	}
	
	
	
	
}
