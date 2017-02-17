package taskAndEmployee;

public class Task {
	
	private String name;
	private int workingHours;
	
	Task(String name, int hours){
		if(!name.isEmpty() && name != null){
			this.name = name;
		}
		this.workingHours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.isEmpty() && name != null){
			this.name = name;
		}
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int hours) {
		if(hours >= 0){
			this.workingHours = hours;
		}
	}
	
}
