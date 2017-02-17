package officeWork;

public abstract class Task {
	
	private String name;
	private int workingHours;
	
	Task(String name, int workingHours){
		if(!name.isEmpty() && name != null){
			this.name = name;
		}
		if(workingHours > 0){
			this.workingHours = workingHours;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(int hours) {
		if(hours >= 0){
			this.workingHours = hours;
		}
	}
	
}
