// Name: Kunjan

class Student
{
    String name;
    int age;
    String course;

    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args)
    {
        Student student = new Student();

        student.name = "Kunjan";
        student.age = 20;
        student.course = "Computer Science";

        student.displayInfo();
    }
}
