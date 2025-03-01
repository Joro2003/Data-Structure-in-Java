import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
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
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
        sc.close();
    }
}
