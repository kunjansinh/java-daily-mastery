// Name: Kunjan

class Car
{
    String brand;
    String model;
    int year;

    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args)
    {
        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Corolla";
        car.year = 2024;

        car.displayInfo();
    }
}
