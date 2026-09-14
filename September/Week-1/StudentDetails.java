// Name: Kunjan

class Student
{
    String name;
    int age;
    String course;

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
        System.out.println();
    }

    public static void main(String[] args)
    {
        Student student1 = new Student("Kunjan", 20, "Computer Science");
        Student student2 = new Student("Rahul", 21, "Software Engineering");

        student1.displayInfo();
        student2.displayInfo();
    }
}
