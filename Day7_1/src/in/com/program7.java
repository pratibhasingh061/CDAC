package in.com;
import java.util.*;

	public class program7 {
	    public static void main(String[] args) {
	        int[] a1 = {23, 60, 94, 3, 102};
	        int[] a2 = {42, 16, 74};
	        
	        int len1 = a1.length;
	        int len2 = a2.length;
	        
	        int i = 0, j = 0;
	        List<Integer> merged = new ArrayList<>();
	        
	        while (i < len1 && j < len2) {
	            merged.add(a1[i++]);
	            merged.add(a2[j++]);
	        }
	        
	        while (i < len1) {
	            merged.add(a1[i++]);
	        }
	        
	        while (j < len2) {
	            merged.add(a2[j++]);
	        }
	        
	        System.out.println("Output: " + merged);
	    }
	}
//Output: [23, 42, 60, 16, 94, 74, 3, 102]