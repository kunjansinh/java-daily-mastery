// Name: Kunjan

public class StudentMarks
{
    public static void main(String[] args)
    {
        int[] marks = {75, 82, 68, 91, 77};

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}