import java.util.Scanner;

// Name: Kunjan

public class SimpleCalculator
{
    public static int add(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber)
    {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Addition: " + add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + subtract(firstNumber, secondNumber));
        System.out.println("Multiplication: " + multiply(firstNumber, secondNumber));

        input.close();
    }
}