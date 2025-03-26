import java.util.*;

public class Main {

    public static int partition(int[] arr, int low, int high) {
        int mid = (high + low) / 2;
        int pivot = arr[mid];
        System.out.println("Pivot is: " + pivot);
        swap(arr, mid, high);
        System.out.println("Array after midpoint swap: " + Arrays.toString(arr));
        int high_i = high - 1;

        for(int low_i = low; low_i < high; low_i++) {
            if (arr[low_i] > pivot) {
                high_i--;
                System.out.println(arr[low_i] + " is greater than " + pivot);
                System.out.println(arr[high_i] + " is less than " + pivot);
                swap(arr, low_i, high_i);
                System.out.println("Array after low/high swap: " + Arrays.toString(arr));

            }

            System.out.println("low_i " + low_i + " high_i" + high_i);
        }
        int i;
        for (i = low; i < high; i++) {
            if (arr[i] > pivot){
                System.out.println(i);
                swap(arr, i, high);
            }
        }
        return i;
//
//
//        for(int step = 0; step < high; step++){
//
//            if (arr[step] < pivot){
//                compare++;
//                swap(arr, step, compare);
//            }
//        }
//        swap(arr, compare+1, high);
//        System.out.println(arr[compare+1]);
//       return compare+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high)
        {
            int pIndex = partition(arr, low, high);
            System.out.println("pIndex is " + pIndex);
            quickSort(arr, pIndex + 1, high);
            quickSort(arr, low, pIndex - 1);

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
