import java.util.*;

public class Main {

    public static int partition(int[] arr, int low, int high){
        int midpoint = (high + low) / 2;
        int midNum = arr[midpoint];
        System.out.println(midNum);
        System.out.println(Arrays.toString(arr));
        swap(arr, midpoint, high);
        System.out.println(Arrays.toString(arr));
        int i = -1;
        for (int j = 0; j < arr.length; j++){

            if (arr[j] < midNum){
                i++;
                swap(arr, i, j);
            }
        }

        System.out.println(Arrays.toString(arr));
        swap(arr, midpoint, high);
        // While loop and add 4 behind 5
        // Return position of 4
        System.out.println(Arrays.toString(arr));
        return -1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        ;
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 10, 3, 4, 8, 6, 9, 1, 7};

        System.out.println(partition(arr, 0, arr.length-1));

    }

}
