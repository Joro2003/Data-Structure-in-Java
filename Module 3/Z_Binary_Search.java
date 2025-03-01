import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for(int i = 0; i < q; i++) {
            int val = sc.nextInt();
            int flag = 0;
            int l = 0;
            int r = n - 1;
            while(l <= r) {
                int mid = (l + r) / 2;
                if(a[mid] == val) {
                    flag = 1;
                    break;
                } 
                else if(a[mid] > val) {
                    r = mid - 1;
                } 
                else {
                    l = mid + 1;
                }
            }
            if(flag == 1) {
                System.out.println("found");
            } 
            else {
                System.out.println("not found");
            }
        }
        sc.close();
    }
}
