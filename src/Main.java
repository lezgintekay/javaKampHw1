

public class Main {
 public static void main(String[] args) {
	
	
	
	Course course1 = new Course(1, "C# + Angular ", "Engin Demiro�");
	Course course2 = new Course(2, "Java + REACT", "Engin Demiro�");

Course[] courses = {course1, course2} ; 

	for (Course course : courses) {
		System.out.println("Kurs Ad�: " + course.courseName +"\n----------------");
	}

	CourseManager courseManager = new CourseManager();
	courseManager.Add(course1);
	courseManager.Add(course2);
	courseManager.Delete(course2);


	User user = new User("lezgintekay", 123456, "tekay.lezgin@yandex.com") ; 
	
	
 }
}
