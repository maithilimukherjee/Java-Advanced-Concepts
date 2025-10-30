import java.util.*;

public class FreqHash {

    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < 15; i++) {
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        list.add(num);
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    System.out.println("List: " + list);
    System.out.println("Frequencies: " + frequencyMap);

}
}

/*
 * Enter number: 5
Enter number: 6
Enter number: 10
Enter number: 11
Enter number: 23
Enter number: 5
Enter number: 9
Enter number: 10
Enter number: 34
Enter number: 34
Enter number: 34
Enter number: 34 
Enter number: 34
Enter number: 7
Enter number: 10
List: [5, 6, 10, 11, 23, 5, 9, 10, 34, 34, 34, 34, 34, 7, 10]
Frequencies: {34=5, 5=2, 6=1, 23=1, 7=1, 9=1, 10=3, 11=1}
 */
