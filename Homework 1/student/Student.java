package student;

public class Student {
	
	private String name;
	private String subject;
	private double grade;
	private byte yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		if(!isDegree){
			yearInCollege++;
			if(yearInCollege == 4){
				isDegree = true;
			}
		}
		else{
			System.out.println("The student has graduaded.");
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(grade > min && age < 30){
			money += amount;
		}
		return money;
	}
	
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public double getGrade() {
		return grade;
	}

	public byte getYearInCollege() {
		return yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setGrade(double grade) {
		if(grade > 1 && grade < 7){
			this.grade = grade;
		}
	}

	public void setYearInCollege(byte yearInCollege) {
		if(yearInCollege > 0 && yearInCollege < 10){
			this.yearInCollege = yearInCollege;
		}
	}

	
}
