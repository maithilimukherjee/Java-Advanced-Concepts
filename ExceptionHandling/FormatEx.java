import java.util.Scanner;
public class FormatEx {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string but it must be a number: ");
        String str = sc.nextLine();
        try
        {
            int result = Integer.parseInt(str);
            System.out.println("You entered the number: " + result);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}v

/*
 * Enter a string but it must be a number: 457
You entered the number: 457
Enter a string but it must be a number: 67@3
Error: Invalid input. Please enter a valid number.

 */