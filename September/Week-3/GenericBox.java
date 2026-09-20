// Name: Kunjan

class Box<T>
{
    private T value;

    public Box(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public void display()
    {
        System.out.println("Box contains: " + value);
    }
}

public class GenericBox
{
    public static void main(String[] args)
    {
        Box<String> nameBox = new Box<>("Kunjan");
        Box<Integer> scoreBox = new Box<>(95);
        Box<Double> priceBox = new Box<>(19.99);

        nameBox.display();
        scoreBox.display();
        priceBox.display();

        System.out.println();

        nameBox.setValue("Java Developer");

        System.out.println("Updated value: " + nameBox.getValue());
    }
}