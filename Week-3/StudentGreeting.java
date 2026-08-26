// Name: Kunjan

public class StudentGreeting
{
    public static void printGreeting()
    {
        System.out.println("Welcome to Java!");
        System.out.println("Keep practicing every day.");
    }

    public static void printStudentInfo(String name, int age)
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        printGreeting();

        System.out.println();

        printStudentInfo("Kunjan", 20);
    }
}