import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        ArrayList<Integer> v1 = new ArrayList<>(); // type 1 
        ArrayList<Integer> v2 = new ArrayList<>(Collections.nCopies(10, 0)); // type 2 
        ArrayList<Integer> v3 = new ArrayList<>(Collections.nCopies(10, -1)); // type 3 
        ArrayList<Integer> v4 = new ArrayList<>(v3); // type 4 
        int[] a = {1, 2, 3, 4, 5};  
        ArrayList<Integer> v5 = new ArrayList<>();  
        for (int num : a) v5.add(num); // type 5 
        ArrayList<Integer> v6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); // type 6 
        for (int i = 0; i < v6.size(); i++) { 
            System.out.print(v6.get(i) + " "); 
        } 
    } 
}
