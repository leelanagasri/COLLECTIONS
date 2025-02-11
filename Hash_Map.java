import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Hash_Map{
	public static void main(String[] args) {
		// Map<Integer> hs = new HashMap<>(); - keys are unique
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		hm.put(0,1);
		hm.put(1,4);
		hm.put(2,3);
		hm.put(3,8);
		hm.put(4,6);
		
		
		// printing keys
		for(int i:hm.keySet()) {
			System.out.print(i+" ");
		}
		
		//printing values
		for(int i:hm.values()) {
			System.out.print(i+" ");
		}
		
		// printing key=value list
		System.out.println(hm.entrySet());
		
		// printing key value pairs 
		for(Map.Entry<Integer, Integer> hmap :
            hm.entrySet()) {
			System.out.println(hmap.getKey()+ " "+hmap.getValue());
		}
		 
		
		// to check whether the key/value is present or not
		System.out.println(hm.containsKey(34));
		System.out.println(hm.containsValue(34));
		
		// to get the class type
		System.out.println(hm.getClass());
		
		System.out.println(hm.isEmpty());
	}

}
