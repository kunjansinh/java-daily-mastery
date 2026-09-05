// Name: Kunjan

public class EvenOddCounter
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 7, 25, 18, 30, 41, 56, 9};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
