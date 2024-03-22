package in.com;

import java.util.Arrays;

public class program1_1 {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

       boolean isEqual = Arrays.equals(arr1, arr2);

        if (isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
//Arrays are equal.