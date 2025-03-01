import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)); 
        ArrayList<Integer> v2 = new ArrayList<>(Arrays.asList(100, 200, 300));         
        v.addAll(2, v2);         
        v.subList(1, 5).clear();         
        Collections.replaceAll(v.subList(0, v.size() - 1), 2, 100);         
        int index = v.indexOf(5); 
        System.out.println(index != -1 ? v.get(index) : "Not Found");         
        System.out.println(v.get(3)); 
        System.out.println(v.get(v.size() - 1)); 
        System.out.println(v.get(v.size() - 1)); 
        System.out.println(v.get(0)); 
        System.out.println(v.get(0));         
        for (Integer num : v) { 
            System.out.print(num + " "); 
        } 
    } 
}
