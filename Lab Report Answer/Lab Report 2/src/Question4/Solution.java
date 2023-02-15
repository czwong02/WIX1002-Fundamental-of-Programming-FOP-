
package Question4;

public class Solution {
	static int globalMax = 0;

    	public static void main(String[] args) {
                
        		int[] a = { 174, 521, 24, 224, 831, 179, 712, 97};
        		int[] b = { 281, 33, 122, 415, 611, 235, 737, 81};
		int ind = 0;
        		permutation(a, b, ind);
        		System.out.println(globalMax);

    	}

    	public static void swap(int[] a, int i, int j){
		// swapping the element in array a at index i and j
        		int temp = a[i];
        		a[i] = a[j];
        		a[j] = temp;
    	}
    
    	public static void permutation(int[] a, int[] b, int ind){
		// base case of the recursion (until the last index of the array)
        		if(ind == a.length-1){
			// calculate the sum of XOR with array a and array b
            		int res = xor(a, b);
			// if the result > global, update globalMax
            		if(res > globalMax){
                			globalMax = res;
            		}
        		}else{
            		for(int i=ind; i<a.length; i++){
                			swap(a, i, ind); //swapping array a between i and ind
				// using recursion to obtain every possible combination
				// by fixing the position of current index and swapping the
				// remaining index from ind+1 until reaching the last index
                			permutation(a, b, ind+1);
                			swap(a, i, ind); // swapping back
            		}
        		}
    	}
    
	// calculate XOR for elements in array a and array b
    	public static int xor(int[] a, int[] b){
        		int sum = 0;
        		for(int i=0; i<a.length; i++){
            		sum += (a[i] ^ b[i]);
        		}
        		return sum;
    	}
}
