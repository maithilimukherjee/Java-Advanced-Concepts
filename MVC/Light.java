/*
 * MVC : COMMANDS AS METHODS
 */

class Light
{
    public void turnOn()
    {
        System.out.println("The light is on");
    }

    public void turnOff()
    {
        System.out.println("The light is off");
    }
}

class RemoteControl
{
    public void pressOnButton(Light light)
    {
        light.turnOn();
    }
}

//commands implemented a methods are tightly coupled with Light (light object's) class
//simple to implement but not flexible


