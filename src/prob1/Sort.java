package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
	
		bubbleSort(array);
		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void bubbleSort(int[] arr){
		int maxPos = arr.length;
		for (int i = 0; i < maxPos; i++) {
			for (int j = 0; j < maxPos-1; j++) {
				if (arr[j] < arr[j+1]) {
					swap(j, j+1, arr);
				}
			}
			maxPos--;
		}
	}
	
	public static void swap(int i, int j, int[] arr) {
		int n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
}