// Name: Kunjan

public class LargestNumber
{
    public static int findLargest(int[] numbers)
    {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args)
    {
        int[] numbers = {25, 48, 12, 76, 34, 91, 53};

        int largest = findLargest(numbers);

        System.out.println("Largest number: " + largest);
    }
}
