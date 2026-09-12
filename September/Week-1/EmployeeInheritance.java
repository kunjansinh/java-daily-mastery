// Name: Kunjan

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary: £" + salary);
    }
}

class Manager extends Employee
{
    String department;

    Manager(String name, double salary, String department)
    {
        super(name, salary);
        this.department = department;
    }

    void displayManager()
    {
        displayEmployee();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args)
    {
        Manager manager = new Manager(
            "Kunjan",
            35000,
            "Technology"
        );

        manager.displayManager();
    }
}
