import java.util.Scanner;
public class ArrExceptions {
    
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 5 elements:");
            for(int i=0; i<5; i++)  
            {
                arr[i] = sc.nextInt();
            }
            
            System.out.println("Enter index to access:");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and 4.");
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}

/*
 * Output:
 * Enter 5 elements:
4
6
7
7
7
Enter index to access:
9
Error: Index out of bounds. Please enter a valid index between 0 and 4.
 */