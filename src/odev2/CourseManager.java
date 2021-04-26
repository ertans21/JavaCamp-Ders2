package odev2;

public class CourseManager {

    public void addCourse(Course course) {
        System.out.println("Course is added and name is: " + course.name);
    }

    public void deleteCourse(Course course) {
        System.out.println("Course which name is " + course.name + " will be deleted");
    }
}
