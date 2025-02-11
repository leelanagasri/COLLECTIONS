import java.util.ArrayList;
import java.util.Arrays;

public class Array_List {
	public static void main(String[] args) {
		// List<Integer> al = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(8);
		al.add(6);
		
		// printing
		for(int i:al) {
			System.out.print(i+" ");
		}
		
		// removing through index only
		al.remove(3);
		
		// remove last element
		al.removeFirst();
				
		// remove last element
		al.removeLast();
		
		// returns the element occured at that index from First 
		System.out.println(al.indexOf(3));
				
		// returns the element occured at that index from last 
		System.out.println(al.lastIndexOf(3));
		
		//insert through index possible
		al.add(2,10);
		
		
		// adds element on First
		al.addFirst(0);
		
		
		// adds element on last
		al.addLast(20);
		
		
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(34,67,28));
		
		// adding all elements to one arraylist
		al.addAll(al2);
		
		// to clear all elements in list
		al2.clear();
		
		// to check whether the element is present or not
		System.out.println(al.contains(34));
		
		// to check whether the elements is present or not
		System.out.println(al.containsAll(al2));
		
		//to get First element
		System.out.println(al.getFirst());
		
		// to get Last element
		System.out.println(al.getLast());
		
		////to get element at particular index
		System.out.println(al.get(4));
		
		// to get the class type
		System.out.println(al.getClass());
		
		// to print all in a list
		System.out.println(al2);
		
		System.out.println(al.isEmpty());
	}

}
