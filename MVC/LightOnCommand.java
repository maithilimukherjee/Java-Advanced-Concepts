/*
 * MVC 2: Commands as Objects
 * Encapsulate commands as objects to decouple sender and receiver/
 * Enable flexibility.
 */

 interface Command
 {
    void execute();
 }

 class LightOnCommand implements Command
 {
    private Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.turnOn();
    }
 }

 class RemoteControl
 {
    private Command command;

    public RemoteControl(Command command)
    {
        this.command = command;
    }

    public void pressButton()
    {
        command.execute();
    }
 }

 class Client
 {
    public static void main(String[] args)
    {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        RemoteControl remote = new RemoteControl(lightOn);
        remote.pressButton();
    }
 }

 /*
  * Code Explanation:
    * 1. Command Interface: Defines the execute method that all command classes must implement.
    * 2. LightOnCommand Class: Implements the Command interface and encapsulates the action of turning on the light.
    *    It holds a reference to the Light object and calls its turnOn method in the execute method.
    * 3. RemoteControl Class: Acts as the invoker that holds a Command object. It has a method pressButton that calls the execute method of the command.
    * 4. Client Class: Demonstrates how to use the Command pattern. It creates a Light object, a LightOnCommand object, and a RemoteControl object.
    *    When the button is pressed, it executes the command to turn on the light.  
  */