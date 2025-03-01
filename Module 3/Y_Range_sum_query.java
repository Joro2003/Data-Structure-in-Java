import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] v = new long[n + 1];
        for(int i = 1; i <= n; i++) {
            v[i] = sc.nextLong();
        }

        long[] pre = new long[n + 1];
        pre[1] = v[1];
        for(int i = 2; i <= n; i++) {
            pre[i] = pre[i - 1] + v[i];
        }

        while(q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long sum;
            if(l == 1) {
                sum = pre[r];
            }
            else {
                sum = pre[r] - pre[l - 1];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
