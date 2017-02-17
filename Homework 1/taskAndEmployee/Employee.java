package taskAndEmployee;

public class Employee {
	
	private String name;
	Task currentTask;
	private int hoursLeft;
	
	Employee(String name){
		if(!name.isEmpty() && name != null){
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.isEmpty() && name != null){
			this.name = name;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if(hoursLeft >= 0){
			this.hoursLeft = hoursLeft;
		}
	}
	
	private void work(){
		if(currentTask.getWorkingHours() < hoursLeft){
			hoursLeft = hoursLeft - currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
		}
		else{
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
			hoursLeft = 0;
		}
	}
	
	public void showReport(){
		if(currentTask.getWorkingHours() == 0){
			System.out.println("The task is already done.");
			System.out.println("Name of worker: " + name);
			System.out.println("Working hours left: " + hoursLeft);
			return;
		}
		System.out.println("Hours needed for the task: " + currentTask.getWorkingHours());
		System.out.println("Working hours for the day: " + getHoursLeft());
		work();
		System.out.println("The name of the worker: " + name);
		System.out.println("The name of the task: " + currentTask.getName());
		System.out.println("Working hours left for worker: " + hoursLeft);
		System.out.println("Hours left to finish the task: " + currentTask.getWorkingHours());
	}

}
