package odev2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Application started");

        Course math = new Course(1, "Mathematics", 7);
        Course eng = new Course(2, "English", 7);
        Course bio = new Course(3, "Biology", 7);

        // Boş constructor için örnek :)
        Course chem = new Course();
        chem.id = 4;
        chem.name = "Chemistry";


        Course[] courses = {math, eng, bio, chem};

        for (Course course : courses) {
            System.out.println("Course id: " + course.id + ", name: " + course.name);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(math);
        courseManager.deleteCourse(math);


        Student student01 = new Student(1, "Ertan", "Şinik", 13, 7, "https://profilePhotoUrl.com/test.jpg");
        Student student02 = new Student(2, "Ahmet", "Yılmaz", 14, 7, "https://profilePhotoUrl.com/test.jpg");
        Student student03 = new Student(3, "Mehmet", "Demir", 12, 7, "https://profilePhotoUrl.com/test.jpg");

        Student student04 = new Student();
        student04.id = 4;
        student04.name = "Ali";
        student04.surname = "Veli";
        student04.classLevel = 7;
        student04.age = 13;
        student01.profilePhotoUrl = "https://localhost/test.jpg";


        Student[] students = {student01, student02, student03, student04};

        StudentManager studentManager = new StudentManager();

        for (Student student : students) {

            studentManager.addStudent(student);
            studentManager.printStudentInfo(student);
        }


        System.out.println("Application finished");
    }
}
