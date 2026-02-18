package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        int target = 5;
        System.out.println("Element found at index : " + linearSearch(arr, target));
    }

    private static String linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return String.valueOf(i);
            }
        }
        return "Element not found";
    }
}
