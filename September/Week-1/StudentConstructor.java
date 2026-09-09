// Name: Kunjan

class Student
{
    String name;
    int age;
    String course;

    // Constructor
    Student(String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args)
    {
        Student student = new Student(
            "Kunjan",
            20,
            "Computer Science"
        );

        student.displayInfo();
    }
}