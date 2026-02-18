package Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        System.out.println("Largest Element : " + largestElement(arr));
    }

    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}
