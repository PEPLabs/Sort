import java.util.Arrays;

public class Application {
    /**
     * You may use this main method to manually test your code in whatever manner you like
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        int[] arr1 = {4, 6, 3, 1, 2, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Here's the first array, unsorted.");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Here's the second array, already sorted.");
        System.out.println(Arrays.toString(arr2));
        int[] res1 = lab.sortArray(arr1);
        int[] res2 = lab.sortArray(arr2);
        System.out.println("Here's the result of your sorting algorithm on the unsorted array.");
        System.out.println(Arrays.toString(res1));
        System.out.println("Here's the result of your sorting algorithm on the sorted array.");
        System.out.println(Arrays.toString(res2));

    }
}
