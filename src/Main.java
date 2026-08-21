import java.util.ArrayList;

class Student{
    private String id;
    private String School = "AU";//Arbitrary University
    private String name;
    private String email;
    private ArrayList<Course> registeredCourses; //This list is specifically allowed to contain Course objects

    Student(int id, String name, String email) {
        this.id = id + School;
        this.name = name;
        this.email = email;
        this.registeredCourses = new ArrayList<>();
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public ArrayList<Course> getRegisteredCourses(){
        return registeredCourses;
    }
}
class Course {
    private String code;
    private String title;
    private int unit;
    private int maximumCapacity;

    // Course management
    Course(String code, String title, int unit, int maximumCapacity) {
        this.code = code;
        this.title = title;
        this.unit = unit;
        this.maximumCapacity = maximumCapacity;
    }
    public String getCode(){
            return code;
    }
    public String getTitle(){
        return title;
    }
    public int getUnit(){
        return unit;
    }
    public int getMaximumCapacity(){
        return maximumCapacity;
    }

    @Override
    public String toString() {
        return "Course Code = " + code + "\nTitle = " + title + "\nUnit = " + unit
                + "\nCapacity = " + maximumCapacity;
    }
}

class RegistrationService{
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
     public void registerStudent(){

     }

     void addCourse(){

     }

     void studentsForCourse(){

     }

     void dropCourse(){

     }

}

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}