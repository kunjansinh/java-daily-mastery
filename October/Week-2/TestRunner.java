// Name: Kunjan

import java.util.ArrayList;
import java.util.List;

public class TestRunner
{
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args)
    {
        System.out.println("==============================");
        System.out.println("       JAVA TEST RUNNER");
        System.out.println("==============================");

        test("Addition", 5, add(2, 3));
        test("Subtraction", 6, subtract(10, 4));
        test("Multiplication", 24, multiply(6, 4));
        test("Division", 5, divide(20, 4));
        test("Negative numbers", -5, add(-2, -3));

        System.out.println();
        System.out.println("==============================");
        System.out.println("        TEST SUMMARY");
        System.out.println("==============================");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total:  " + (passed + failed));

        if (failed == 0)
        {
            System.out.println("All tests passed!");
        }
        else
        {
            System.out.println("Some tests failed.");
        }
    }

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int subtract(int a, int b)
    {
        return a - b;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static int divide(int a, int b)
    {
        if (b == 0)
        {
            throw new IllegalArgumentException(
                "Cannot divide by zero."
            );
        }

        return a / b;
    }

    public static void test(String testName, int expected, int actual)
    {
        if (expected == actual)
        {
            passed++;
            System.out.println("[PASS] " + testName);
        }
        else
        {
            failed++;
            System.out.println(
                "[FAIL] " + testName
                + " | Expected: " + expected
                + " | Actual: " + actual
            );
        }
    }
}