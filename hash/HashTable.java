package hash;
import java.lang.*;
import java.util.*;
public class HashTable{
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap/* or /hashmap*/<>();

        map.put("Apple",10);
        map.put("Banana",20);
        map.put("guava",40);

        System.out.println(map.get("Banana"));
        System.out.println(map.get("Apple"));
        System.out.println(map.get("guava"));

        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsKey("Banana"));

        for(String key:map.keySet()){
            System.out.println("key="+key);
        }

        for(Integer values:map.values()){
            System.out.println("values="+values);
        }
        /*other methods
        system.out.println("Size="+size);

        map.remove("banana");
        System.out.println("Size="+size);*/



        
    }
}
