import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        sc.nextLine(); 
        ArrayList<String> v = new ArrayList<>(); 
        for (int i = 0; i < n; i++) { 
            v.add(sc.nextLine()); 
        } 
        for (String s : v) { 
            System.out.println(s); 
        } 
        sc.close(); 
    } 
}
