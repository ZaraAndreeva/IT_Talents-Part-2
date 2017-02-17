package officeWork;

import officeWork.Task;

public class Employee {
	
	private String name;
	private Task currentTask;
	private int hoursLeft;
	static AllWork allWork;
	
	Employee(String name){
		if(!name.isEmpty() && name != null){
			this.name = name;
		}
	}

	public void work(){
		if(currentTask == null){
			if(allWork.getFreePlacesForTasks() > 0){
				this.currentTask = allWork.getNextTask();
			}
		}
		
//		if(currentTask.getWorkingHours() == 0) {
//			if(allWork.getFreePlacesForTasks() > 0){
//				this.currentTask = allWork.getNextTask();
//			}
//		}

		if(currentTask.getWorkingHours() < this.hoursLeft){
			this.hoursLeft = this.hoursLeft - currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
			if(!allWork.isAllWorkDone()){
				this.currentTask = allWork.getNextTask();
				this.work();
			}
		}
		else{
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
			this.hoursLeft = 0;
		}
	}
	
	void startWorkingDay(){
		this.hoursLeft = 8;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public static AllWork getAllWork() {
		return Employee.allWork;
	}

	public static void setAllWork(AllWork allWork) {
		if(allWork != null){
			Employee.allWork = allWork;
		}
	}
	

	public String getName() {
		return name;
	}
	
	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if(hoursLeft >= 0){
			this.hoursLeft = hoursLeft;
		}
	}

	public void setCurrentTask(Task currentTask) {
		if(currentTask != null){
			this.currentTask = currentTask;
		}
	}
	
	

}
