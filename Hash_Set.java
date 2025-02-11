import java.util.HashSet;
import java.util.Arrays;

public class Hash_Set{
	public static void main(String[] args) {
		// Set<Integer> hs = new HashSet<>(); - no duplicates
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(4);
		hs.add(3);
		hs.add(8);
		hs.add(6);
		
		
		// printing
		for(int i:hs) {
			System.out.print(i+" ");
		}
		
		// removing through index only
		hs.remove(3);
		
		HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(34,67,28));
		
		// adding all elements to one Set
		hs.addAll(hs2);
		
		// to clear all elements in Set
		hs2.clear();
		
		// to check whether the element is present or not
		System.out.println(hs.contains(34));
		
		// to check whether the elements is present or not
		System.out.println(hs.containsAll(hs2));
		
		// to get the class type
		System.out.println(hs.getClass());
		
		// to print all in a set
		System.out.println(hs2);
		
		System.out.println(hs.isEmpty());
	}

}
