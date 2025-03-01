import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();
            boolean found = false;
            for(int j = 0; j < n; j++){
                if(a[j] == x){
                    found = true;
                    break;
                }
            }
            if(found)
                System.out.println("found");
            else
                System.out.println("not found");
        }
        sc.close();
    }
}
