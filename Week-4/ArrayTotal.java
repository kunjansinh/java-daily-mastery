// Name: Kunjan

public class ArrayTotal
{
    public static int calculateTotal(int[] numbers)
    {
        int total = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            total = total + numbers[i];
        }

        return total;
    }

    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};

        int total = calculateTotal(numbers);

        System.out.println("Total: " + total);
    }
}
