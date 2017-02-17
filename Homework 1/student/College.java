package student;

public class College {

	public static void main(String[] args) {
		
		Student st1 = new Student("Zara","Computer science",20);
		st1.setGrade(6.00);
		st1.setYearInCollege((byte) 2);
		
		Student st2 = new Student("Ivan","Computer science", 21);
		st2.setGrade(5.5);
		st1.setYearInCollege((byte) 2);
		
		System.out.println("The first group: ");
		
		StudentGroup students1 = new StudentGroup("Computer science");
		students1.addStudent(st1);
		students1.addStudent(st2);
		
		students1.printStudentsInGroup();
		
		System.out.println("Empty places in the group: " + students1.getFreePlaces());
		System.out.println("Group subject is: " + students1.getGroupSubject());
		System.out.println("The best student is: " + students1.theBestStudent());
		
		System.out.println();
		
		Student st3 = new Student("Natalie","Software engineering",22);
		st3.setGrade(4.5);
		st3.setYearInCollege((byte) 3);
		
		Student st4 = new Student("Deyan","Software engineering",22);
		st4.setGrade(4.0);
		st4.setYearInCollege((byte) 3);
		
		Student st5 = new Student("Asen", "Software engineering",21);
		st5.setGrade(5.0);
		st5.setYearInCollege((byte) 3);
		
		System.out.println("The second group: ");
		
		StudentGroup students2 = new StudentGroup("Software engineering");
		students2.addStudent(st3);
		students2.addStudent(st4);
		students2.addStudent(st5);
		
		students2.printStudentsInGroup();
		System.out.println("Empty places in the group: " + students2.getFreePlaces());
		System.out.println("Group subject is: " + students2.getGroupSubject());
		System.out.println("The best student is: " + students2.theBestStudent());
		
		System.out.println();
		
		students2.emptyGroup();
		students2.printStudentsInGroup();
		System.out.println(students2.theBestStudent());
		
//		Student st6 = new 
		
		
	}

}
