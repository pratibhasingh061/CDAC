package in.com;

public class program5 {

	public static void main(String[] args) {
        int[] array = {10, 15, 43, 67, 6, 84, 39};

        int smallest = findSmallest(array);
        int largest = findLargest(array);

        System.out.println("Smallest number in the array: " + smallest);
        System.out.println("Largest number in the array: " + largest);
    }

    public static int findSmallest(int[] array) {
        int smallest = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int findLargest(int[] array) {
        int largest = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}
//Smallest number in the array: 6
//Largest number in the array: 84

