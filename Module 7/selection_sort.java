import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input size
        int n = sc.nextInt();
        
        // Create an array to store the elements
        int[] a = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Perform Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    // Swap elements
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
}
