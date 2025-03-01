import java.util.Scanner;
public class DivideByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();        
        for (int i = n; i >= 1; i /= 3) {
            System.out.println(i);
        }        
        scanner.close();
    }
}
