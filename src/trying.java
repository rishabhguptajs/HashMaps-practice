import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class trying {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 4, 5, 6};
        int c = arr_working(arr);
        System.out.println("Count is " + c);
        System.out.println("Array after deleting zeros: " + Arrays.toString(remove_zeros(arr)));
    }

    private static int arr_working(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            map.put(i, arr[i]);
        }

//        let's count the number of 1's in the given array
        for(int a: arr){
            if(a == 1) count++;
        }

        return count;
    }

    private static Integer[] remove_zeros(int[] arr){
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            map2.put(i, arr[i]);
        }
        for(int i=0; i<n; i++){
            if(map2.get(i) == 0) map2.remove(i);
        }

        System.out.println("Size of map after deleting 0's : " + map2.size());
        System.out.println("Collection of values remaining in the map: " + map2.values());
        return map2.values().toArray(new Integer[0]);
    }

    static void notes(){
        // Create an empty hash map by declaring object
        // of string and integer type
//        HashMap<String, Integer> map = new HashMap<>();
//
//        // Adding elements to the Map
//        // using standard put() method
//        map.put("Rishabh", 10);
//        map.put("Virat", 30);
//        map.put("ABD", 20);
//
//        // Print size and content of the Map
//        System.out.println("Size of map is: "
//                + map.size());
//
//        // Printing elements in object of Map
//        System.out.println(map);

//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("Rishabh", 99);
//        map.put("Lila", 98);
//        map.put("Husss", 89);

//        System.out.println(map.get("Rishabh"));

//        HashSet<Integer> set = new HashSet<Integer>();
//        set.add(65);
//        set.add(22);
//        set.add(90);
//        set.add(56);
//
//        System.out.println(set);

//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("Rishabh", 90);
//        map.put("Pulkit", 99);
//        map.put("Kajal", 100);

//        e is like a variable to access values inside map
//        for(Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
//        }

//        adding element to hashmap - time complexity [O(1)]
//        removing element to hashmap - time complexity [O(1)]
//        extracting element from hashmap - time complexity [O(1)]

//        map.equals -> compares an object with a map for checking if they're equal or not
    }
}
