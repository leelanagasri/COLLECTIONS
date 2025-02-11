// Array is not a part of Collections but these are created due to array only.
public class Array {
	public static void main(String[] args) {
		int arr[] = new int[5];
		/*
		Declarations can be done in below ways:
		int arr[] = new int[5];
		int[] arr = new int[5];
		int[] arr = {1,3,5,7,2};
		int arr[] = {1,2,3,4,5};
		*/
		
		//Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i] = i+1;
			//arr[i] = sc.nextInt();
		}
		
		// for printing
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// we can replace values in array
		for(int i:arr) {
			i = 0;
			System.out.print(i+" ");
		}
	}
}
