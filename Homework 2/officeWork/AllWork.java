package officeWork;

public class AllWork {
	
	Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	AllWork(){
		this.freePlacesForTasks = 10;
		this.tasks = new Task[freePlacesForTasks];
		this.currentUnassignedTask = 0;
	}
	
	void addTask(Task newTask){
		if(freePlacesForTasks > 0){
			this.tasks[tasks.length - freePlacesForTasks] = newTask;
			freePlacesForTasks--;
		}
	}
	
	public Task getNextTask(){
		if(freePlacesForTasks > 0){
			return tasks[currentUnassignedTask++];
		}
		else{
			return null;
		}
	}
	
	boolean isAllWorkDone(){
		int count = 0;
		int countAllTasks = 0;
		if(freePlacesForTasks == 0){
			for(int i = 0; i < tasks.length; i++){
				if(tasks[i] != null){
					if(tasks[i].getWorkingHours() == 0){
						count++;
					}
					countAllTasks++;
				}
			}
		}
		if(count == countAllTasks){
			return true;
		}
		return false;
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

}
