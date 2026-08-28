// Name: Kunjan

public class MarksAverage
{
    public static void main(String[] args)
    {
        int[] marks = {75, 82, 68, 91, 77};

        int total = 0;

        for (int i = 0; i < marks.length; i++)
        {
            total = total + marks[i];
        }

        double average = (double) total / marks.length;

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
}