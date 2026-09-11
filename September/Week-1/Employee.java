// Name: Kunjan

class Employee
{
    private String name;
    private double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if (salary >= 0)
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("Salary cannot be negative.");
        }
    }

    public void displayInfo()
    {
        System.out.println("Employee: " + name);
        System.out.println("Salary: £" + salary);
    }

    public static void main(String[] args)
    {
        Employee employee = new Employee("Kunjan", 25000);

        employee.displayInfo();

        employee.setSalary(28000);

        System.out.println();
        System.out.println("Updated Information:");

        employee.displayInfo();
    }
}
