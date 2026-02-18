package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        System.out.println("Second Largest Element : " + secondLargestElement(arr));
    }

    private static String secondLargestElement(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                secondMax = max;
                max = j;
            } else if (secondMax < j && j != max) {
                secondMax = j;
            }
        }
        return secondMax == Integer.MIN_VALUE ? "No Second Largest Element" : String.valueOf(secondMax);
    }
}
