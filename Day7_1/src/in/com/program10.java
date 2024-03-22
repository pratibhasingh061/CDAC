package in.com;

public class program10 {
	    public static void main(String[] args) {
	        int[] arr1 = {5, 14, 35, 90, 139};
	        int[] arr2 = {88, 67, 35, 14, -12};
	        int[] arr3 = {65, 14, 129, 34, 7};

	        System.out.println("Output  arr1: " + getOrder(arr1));
	        System.out.println("Output  arr2: " + getOrder(arr2));
	        System.out.println("Output  arr3: " + getOrder(arr3));
	    }

	    public static String getOrder(int[] arr) {
	        boolean ascending = true;
	        boolean descending = true;

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > arr[i - 1]) {
	                descending = false;
	            } else if (arr[i] < arr[i - 1]) {
	                ascending = false;
	            }
	        }

	        if (ascending) {
	            return "Ascending";
	        } else if (descending) {
	            return "Descending";
	        } else {
	            return "Random";
	        }
	    }
	}
//Output  arr1: Ascending
//Output  arr2: Descending
//Output  arr3: Random

