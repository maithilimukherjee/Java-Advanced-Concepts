import java.util.Scanner;

class AgeException extends Exception
{
    public AgeException(String str)
    {
        super(str);
    }
}

interface Voter
{
    void details();
    void isEligible(int age);
}

class A implements Voter{

    @Override
    public void details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        isEligible(age);
    }

    @Override
    public void isEligible(int age)
    {
        System.out.println("Checking eligibility...");
        try{
            if(age<18)
            {
                throw new AgeException("You are not eligible to vote.");
            }
            else
            {
                System.out.println("You are eligible to vote.");
            }
        }

        catch(AgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class VotingPortal
{
    public static void main(String[] args)
    {
        Voter voter = new A();
        voter.details();
    }
}

/*
 * Output:
 * Enter your name: Tina
Welcome, Tina
Enter your age: 20
Checking eligibility...
You are eligible to vote.

Enter your name: Jenna
Welcome, Jenna
Enter your age: 16
Checking eligibility...
You are not eligible to vote.

 */