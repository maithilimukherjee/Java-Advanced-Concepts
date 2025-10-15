interface Car
{
    void details();
    boolean available();
    void price();
}

class Hyundai implements Car
{
    @Override
    public void details()
    {
        System.out.println("Hyundai: Model - Elantra, Year - 2022");
    }

    @Override
    public boolean available()
    {
        return true;
    }

    @Override
    public void price()
    {
        System.out.println("Price: $20,000");
    }
}

class Tesla implements Car
{
    @Override
    public void details()
    {
        System.out.println("Tesla: Model - Model 3, Year - 2023");
    }

    @Override
    public boolean available()
    {
        return false;
    }

    @Override
    public void price()
    {
        System.out.println("Price: $35,000");
    }
}

class Maruti implements Car
{
    @Override
    public void details()
    {
        System.out.println("Maruti: Model - Swift, Year - 2021");
    }

    @Override
    public boolean available()
    {
        return true;
    }

    @Override
    public void price()
    {
        System.out.println("Price: $15,000");
    }
}

public class Cars
{
    public static void main(String[] args)
    {
        Car hyundai = new Hyundai();
        hyundai.details();
        System.out.println("Available: " + hyundai.available());
        hyundai.price();

        Car tesla = new Tesla();
        tesla.details();
        System.out.println("Available: " + tesla.available());
        tesla.price();

        Car maruti = new Maruti();
        maruti.details();
        System.out.println("Available: " + maruti.available());
        maruti.price();
    }
}