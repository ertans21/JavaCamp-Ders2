package odev2;

public class Course {

    int id;
    String name;
    int classLevel;

    public Course() {
        System.out.println("Empty Constructor for Course");
    }

    public Course(int id, String name, int classLevel) {
        this.id = id;
        this.name = name;
        this.classLevel = classLevel;
    }


}
