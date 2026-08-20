class Student{
    int id;
    String name;
    String email;
    String registeredCourses;
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
     public void registerStudent(){}
}

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}