// Name: Kunjan

record Student(String name, int age, String course, double grade)
{
    public String performance()
    {
        if (grade >= 70)
        {
            return "Excellent";
        }
        else if (grade >= 60)
        {
            return "Good";
        }
        else if (grade >= 40)
        {
            return "Pass";
        }
        else
        {
            return "Fail";
        }
    }
}

public class StudentRecord
{
    public static void main(String[] args)
    {
        Student student1 =
            new Student("Kunjan", 20, "Computer Science", 78.5);

        Student student2 =
            new Student("Alex", 21, "Software Engineering", 64.0);

        Student student3 =
            new Student("Sarah", 20, "Cyber Security", 82.0);

        System.out.println("==============================");
        System.out.println("       STUDENT RECORDS");
        System.out.println("==============================");

        displayStudent(student1);
        displayStudent(student2);
        displayStudent(student3);
    }

    public static void displayStudent(Student student)
    {
        System.out.println();
        System.out.println("Name: " + student.name());
        System.out.println("Age: " + student.age());
        System.out.println("Course: " + student.course());
        System.out.println("Grade: " + student.grade());
        System.out.println("Performance: " + student.performance());
    }
}