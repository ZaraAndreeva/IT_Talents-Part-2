package officeWork;

public class Demo {

	public static void main(String[] args) {

		AllWork allWork = new AllWork();
		allWork.addTask(new TaskTranslate("document", 5));
		allWork.addTask(new TaskTranslate("document", 5));
		allWork.addTask(new TaskTranslate("document", 5));
		allWork.addTask(new TaskCallCenter("call from Paris",3));
		allWork.addTask(new TaskCallCenter("call from Paris",3));
		allWork.addTask(new TaskCallCenter("call from Paris",3));
		allWork.addTask(new TaskCallCenter("call from Paris",3));
		Employee.setAllWork(allWork);
		Employee worker = new Employee("Dido");
		Employee worker1 = new Employee("Nati");
		Employee worker2 = new Employee("Valyo");
		Employee worker3 = new Employee("Ivan");
		Employee worker4 = new Employee("Zara");
		
		int count = 0;
		while(true){
			worker.startWorkingDay();
			worker1.startWorkingDay();
			worker2.startWorkingDay();
			worker3.startWorkingDay();
			worker4.startWorkingDay();
			worker.work();
			worker1.work();
			worker2.work();
			worker3.work();
			worker4.work();
			count++;
			if(Employee.getAllWork().isAllWorkDone()){
				break;
			}
		}
		
		if(count == 1){
			System.out.println("The tasks are finished for " + count + " day.");
		}
		else{
			System.out.println("The tasks are finished for " + count + " days.");
		}
		
	}
}
