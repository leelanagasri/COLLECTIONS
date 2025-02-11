import java.util.LinkedList;
import java.util.Arrays;

public class Linked_list {
	public static void main(String[] args) {
		// List<Integer> ll = new LinkedList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(4);
		ll.add(3);
		ll.add(8);
		ll.add(6);
		
		// add == offer but exceptions will not be raised instead it gives null
		ll.offerFirst(2);
		ll.offerLast(42);
		
		// printing
		for(int i:ll) {
			System.out.print(i+" ");
		}
		
		// removing through index only
		ll.remove(3);
		
		// remove last element
		ll.removeFirst();
				
		// remove last element
		ll.removeLast();
		
		//insert through index possible
		ll.add(2,10);
		
		
		// adds element on First
		ll.addFirst(0);
		
		
		// adds element on last
		ll.addLast(20);
		
		
		LinkedList<Integer> ll2 = new LinkedList<>(Arrays.asList(34,67,28));
		
		// adding all elements to one LinkedList
		ll.addAll(ll2);
		
		// to clear all elements in list
		ll2.clear();
		
		// to check whether the element is present or not
		System.out.println(ll.contains(34));
		
		// to check whether the elements is present or not
		System.out.println(ll.containsAll(ll2));
		
		//to get First element
		System.out.println(ll.getFirst());
		
		// to get Last element
		System.out.println(ll.getLast());
		
		////to get element at particular index
		System.out.println(ll.get(4));
		
		// to get the class type
		System.out.println(ll.getClass());
		
		// to print all in a list
		System.out.println(ll2);
		
		System.out.println(ll.isEmpty());
	}

}
