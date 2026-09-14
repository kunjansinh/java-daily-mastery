// Name: Kunjan

class Animal
{
    void makeSound()
    {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog();

        dog.makeSound();
    }
}