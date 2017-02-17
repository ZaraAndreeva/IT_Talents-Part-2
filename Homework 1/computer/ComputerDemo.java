package computer;

public class ComputerDemo {

	public static void main(String[] args) {
		
//		Computer computer1 = new Computer();
//		computer1.year = 2010;
//		computer1.price = 2000;
//		computer1.operationSystem = "Windows 7";
//		computer1.isNotebook = false;
//		computer1.hardDiskMemory = 1000;
//		computer1.freeMemory = 300;
//		computer1.changeOperationSystem("Windows 8");
//		
//		System.out.println("Parameters for the first computer: ");
//		System.out.println("The year it is made: " + computer1.year);
//		System.out.println("The price is: " + computer1.price);
//		System.out.println("The operation system is: " + computer1.operationSystem);
//		System.out.println("Is it notebook? " + computer1.isNotebook);
//		System.out.println("Hard disk memory: " + computer1.hardDiskMemory);
//		System.out.println("Free memory: " + computer1.freeMemory);
//		System.out.println();
//		
//		Computer computer2 = new Computer();
//		computer2.year = 2015;
//		computer2.price = 3200;
//		computer2.operationSystem = "Windows 10";
//		computer2.isNotebook = true;
//		computer2.hardDiskMemory = 2000;
//		computer2.freeMemory = 1300;
//		computer2.useMemory(100);	
//		
//		System.out.println("Parameters for the second computer: ");
//		System.out.println("The year it is made: " + computer2.year);
//		System.out.println("The price is: " + computer2.price);
//		System.out.println("The operation system is: " + computer2.operationSystem);
//		System.out.println("Is it notebook? " + computer2.isNotebook);
//		System.out.println("Hard disk memory: " + computer2.hardDiskMemory);
//		System.out.println("Free memory: " + computer2.freeMemory);
		
		Computer computer3 = new Computer(2013,2500.0,1000,800);
		Computer computer4 = new Computer(2012,2000.0,500,200);
		
		System.out.println("The price of the first computer is: " + computer3.getPrice());
		System.out.println("The price of the second computer is: " + computer4.getPrice());
		
		if(computer4.comparePrice(computer3) == -1){
			System.out.println("The price of the first computer is higher.");
		}
		else
		if(computer4.comparePrice(computer3) == 1){
			System.out.println("The price of the second computer is higher.");
		}
		else
		if(computer4.comparePrice(computer3) == 0){
			System.out.println("The prices are equal.");
		}
		
		System.out.println();
		
		Computer computer5 = new Computer(2010,1500.0,false,1000,200,"Windows 7");
		Computer computer6 = new Computer(2014,3000.0,true,2000,1500,"Windows 8");
		
		System.out.println("The price of the first computer is: " + computer5.getPrice() + " leva");
		System.out.println("The price of the second computer is: " + computer6.getPrice() + " leva"); 
		
		if(computer6.comparePrice(computer5) == -1){
			System.out.println("The price of the first computer is higher.");
		}
		else
		if(computer6.comparePrice(computer5) == 1){
			System.out.println("The price of the second computer is higher.");
		}
		else
		if(computer6.comparePrice(computer5) == 0){
			System.out.println("The prices are equal.");
		}
		
		System.out.println();
		
		System.out.println("The operation system of the first computer is: " + computer5.getOperationSystem());
		computer5.changeOperationSystem("Windows 10");
		System.out.println("The new operation system is: " + computer5.getOperationSystem());
		
		System.out.println();
		
		System.out.println("The free memory of the second computer is: " + computer6.getFreeMemory() + " MB");
		computer6.useMemory(500);
		System.out.println("Now you have: " + computer6.getFreeMemory() + " MB free memory.");

	}

}
