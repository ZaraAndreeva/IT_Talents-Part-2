package student;

public class StudentGroup {
	
	private String groupSubject;
	Student[] students;
	private int freePlaces;
	
	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String groupSubject){
		this();
		this.groupSubject = groupSubject;
	}
	
	void addStudent(Student s){
		if(freePlaces == 0){
			System.out.println("There are no free places.");
			return;
		}
		for(int i = 0; i < students.length; i++){
			if(students[i] == null && freePlaces > 0 && s.getSubject().equals(groupSubject)){
				students[i] = s;
				freePlaces--;
				break;
			}
		}
	}
	
	void emptyGroup(){
		System.out.println("The group is empty.");
		this.students = new Student[5];
		freePlaces = 5;
	}
	
	String theBestStudent(){
		if(freePlaces == 5){
			return "There are no students in this group.";
		}
		else{
			Student best = students[0];
			int index = 0;
			for(int i = 0; i < students.length; i++){
				if(students[i] != null){
					if(students[i].getGrade() > best.getGrade()){
						best.setGrade(students[i].getGrade());
						index = i;
					}
				}
			}
			return students[index].getName();
		//	return best.name;
		}
	}
	
	void printStudentsInGroup(){
		for(int i = 0; i < students.length; i++){
			if(students[i] != null){
				System.out.println("The name is: " + students[i].getName());
				System.out.println("The age is: " + students[i].getAge());
				System.out.println("The grade is: " + students[i].getGrade());
				System.out.println("Years in college: " +  students[i].getYearInCollege());
				System.out.println();
			}
		}
	}
	
	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		if(groupSubject != null && !groupSubject.isEmpty()){
			this.groupSubject = groupSubject;
		}
	}

	public int getFreePlaces() {
		return freePlaces;
	}


}
