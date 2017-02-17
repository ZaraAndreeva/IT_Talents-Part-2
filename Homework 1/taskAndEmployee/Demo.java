package taskAndEmployee;

public class Demo {

	public static void main(String[] args) {
		
		Task task = new Task("Create an app",5);
		Employee worker = new Employee("Zara");
		worker.setHoursLeft(7);
		worker.currentTask = task;
		worker.showReport();
		
		System.out.println();
		
		Task newTask = new Task("Create a website", 12);
		Employee worker1 = new Employee("Angela");
		worker1.setHoursLeft(9);
		worker1.currentTask = newTask;
		worker1.showReport();
		
		System.out.println();
		
		Employee worker2 = new Employee("Natalie");
		worker2.setHoursLeft(10);
		worker2.currentTask = newTask;
		worker2.showReport();
		
		System.out.println();
		
		Employee worker3 = new Employee("Desi");
		worker3.setHoursLeft(8);
		worker3.currentTask = newTask;
		worker3.showReport();
		
	}

}
