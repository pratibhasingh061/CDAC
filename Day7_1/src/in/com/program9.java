package in.com;

public class program9 {

		public static void main(String[] args) {
	        int n = 6; 
	        for (int i = 1; i <= n; i++) {
	            int result = 0;
	            if (i % 2 == 1) {
	            	result = (int) Math.pow(i, 3);
	            } else {
	            	result = (int) Math.pow(i, 2);
	            }
	            System.out.print(result + " ");
	        }
	    }
	}

	//1 4 27 16 125 36 


