package oopExample;

public class Main {

	public static void main(String[] args) {
		Educator educator=new Educator(1111111, "Engin", "Demiroð");

		Course course=new Course(1, "Java course");
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course);
		
		System.out.println(educator.firstName +" " + educator.lastName);
	}

}
