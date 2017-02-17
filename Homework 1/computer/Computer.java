package computer;

public class Computer {
	
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory; 
		this.freeMemory = freeMemory; 
		this.operationSystem = operationSystem;
	}
	
	int comparePrice (Computer c){
		if(this.price < c.price){
			return -1;
		}
		else
		if(this.price == c.price){
			return 0;
		}
		else{
			return 1;
		}
	}
	
	void changeOperationSystem(String newOperationSystem){
		System.out.println("The operation system is changed.");
		operationSystem = newOperationSystem;
	}
	
	void useMemory(int memory){
		System.out.println("You used memory.");
		if(memory < freeMemory){
			freeMemory -= memory;
		}
		else{
			System.out.println("Not enough free memory!");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) { 
		System.out.println("The price is changed.");
		if(price > 0){
			this.price = price;
		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public int getYear() {
		return year;
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public double getFreeMemory() {
		return freeMemory;
	}

}
