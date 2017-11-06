
public class LinearSearch {
	
	public static int myLinearSearch(int[] arr, int find){
		for (int i=0; i < arr.length ; i++){
			if (find == arr[i]){
				System.out.println("Your value was found.  It is in spot #" + (i+1));
				return i;
		}
		}
		System.out.print("That value, " + find + ", was not found in the provided array.");
		return -1;
	}
	
	
}
