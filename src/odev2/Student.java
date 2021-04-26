package odev2;

public class Student {

    int id;
    String name;
    String surname;
    int age;
    int classLevel;
    String profilePhotoUrl;

    public Student() {
        System.out.println("Empty Constructer for Student");
    }

    public Student(int id, String name, String surname, int age, int classLevel, String profilePhotoUrl) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.classLevel = classLevel;
        this.profilePhotoUrl = profilePhotoUrl;
    }
}
