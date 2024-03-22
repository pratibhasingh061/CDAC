package in.com;

public class program8 {

	    public static void main(String[] args) {
	        int[] arr = {5, 14, 35, 89, 140};
	        
	        for (int i = 0; i <= arr.length - 3; i++) {
	            int sum = arr[i] + arr[i + 1] + arr[i + 2];
	            double average = sum / 3.0; // Calculate average
	            System.out.print((int) average + " ");
	        }
	    }
	}
//18 46 88 