import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        NumberSeparator sp = new NumberSeparator(size);
        sp.separateNumbers(numbers);

        System.out.println("Even numbers: ");
        int[] evenNumbers = sp.getEven();
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers: ");
        int[] oddNumbers = sp.getOdd();
        for (int num : oddNumbers) 
            System.out.print(num + " ");
            
        NearestNeighboringNumbers nm = new NearestNeighboringNumbers();
        nm.findIndexWithSmallestDistance(numbers);
        
        ArrayToArrayList converter = new ArrayToArrayList();
        List<Integer> arrayList = converter.convertArrayToArrayList(numbers);
        System.out.println("Converted ArrayList: " + arrayList);
        
        ArrayListToArray converter2 = new ArrayListToArray();
        converter2.convertArrayListToArray(arrayList);
        
    }
}
