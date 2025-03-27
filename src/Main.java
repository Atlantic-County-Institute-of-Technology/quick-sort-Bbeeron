import java.util.*;

public class Main {

    public static int partition(int[] arr, int low, int high) {
        int mid = (high + low) / 2;
        int pivot = arr[mid];
        System.out.println("Pivot is: " + pivot);
        System.out.println("Array before midpoint swap: " + Arrays.toString(arr));
        swap(arr, mid, high);
        System.out.println("Array after midpoint swap: " + Arrays.toString(arr));
        int high_i = high-1;

        for(int low_i = low; low_i < high_i; low_i++) {
//https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm
            if (arr[low_i] > pivot && arr[high_i] < pivot) {

                System.out.println(arr[low_i] + " is greater than " + pivot);
                System.out.println(arr[high_i] + " is less than " + arr[low_i]);
                swap(arr, low_i, high_i);
                System.out.println("Array after low/high swap: " + Arrays.toString(arr));
                high_i--;
            }

            System.out.println("low_i " + low_i + " high_i" + high_i);
        }
        int i;
        for (i = low; i < high; i++) {
            if (arr[i] > pivot){
                swap(arr, i, high);
            }
        }
        System.out.println("Array final: " + Arrays.toString(arr));
        return i;

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        int pIndex = partition(arr, low, high);
        if(low < high)
        {
            System.out.println("pIndex is " + pIndex);
            System.out.println("Left quicksort: " + (pIndex-1));
            quickSort(arr, low, pIndex-1);
            System.out.println("Right quicksort: " + (pIndex+1));
            quickSort(arr, pIndex+1, high);
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 10, 3, 4, 8, 6, 9, 1, 7};

        //{1, 5, 8, 9, 7, 10, 6, 3, 2, 4}
        if (arr.length == 0){
            System.out.println("Empty Array");
        }
        else{
            quickSort(arr, 0, arr.length-1);
        }


    }

}
