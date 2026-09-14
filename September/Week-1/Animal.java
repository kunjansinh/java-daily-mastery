// Name: Kunjan

class Animal
{
    void eat()
    {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("The dog is barking.");
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}
