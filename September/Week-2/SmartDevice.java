// Name: Kunjan

interface Controllable
{
    void turnOn();
    void turnOff();
}

class SmartLight implements Controllable
{
    private boolean on;

    public void turnOn()
    {
        on = true;
        System.out.println("💡 Smart Light is ON");
    }

    public void turnOff()
    {
        on = false;
        System.out.println("💡 Smart Light is OFF");
    }

    public void showStatus()
    {
        System.out.println("Light status: " + (on ? "ON" : "OFF"));
    }
}

class SmartFan implements Controllable
{
    private boolean on;

    public void turnOn()
    {
        on = true;
        System.out.println("🌀 Smart Fan is ON");
    }

    public void turnOff()
    {
        on = false;
        System.out.println("🌀 Smart Fan is OFF");
    }
}

public class SmartDevice
{
    public static void main(String[] args)
    {
        SmartLight light = new SmartLight();
        SmartFan fan = new SmartFan();

        light.turnOn();
        fan.turnOn();

        System.out.println();

        light.showStatus();

        System.out.println();

        light.turnOff();
        fan.turnOff();
    }
}