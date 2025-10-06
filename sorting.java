import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int arr[] = {25, 10, 5, 40, 20};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int result = Arrays.binarySearch(arr, key);
        if (result >= 0)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");

        sc.close();
    }
}
