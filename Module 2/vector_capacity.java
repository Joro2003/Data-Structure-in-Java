import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        ArrayList<Integer> v = new ArrayList<>(); 
        v.add(10); 
        v.add(20); 
        v.add(30); 
        while (v.size() < 7) v.add(100); 
        for (int i = 0; i < v.size(); i++) { 
            System.out.print(v.get(i) + " "); 
        } 
    } 
}
