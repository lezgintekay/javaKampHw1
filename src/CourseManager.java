
public class CourseManager {
	
	public void Add(Course course) {
		System.out.println("E�itmen: " + course.courseTeacher);
		System.out.println("Kurs: " + course.courseName + "\nBasariyla Eklendi");

	
	}
	public void Delete (Course course) {
		System.out.println("E�itmen: " + course.courseTeacher);
		System.out.println("Kurs: " + course.courseName + "\nBasariyla Silindi");
	}

}
