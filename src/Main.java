import java.util.*;

public class  Main {

    public static int partition(int[] arr, int low, int high){
        int mid = (high + low) / 2;
        int pivot = arr[mid];
        System.out.println(Arrays.toString(arr));
        swap(arr, mid, high);
        System.out.println(Arrays.toString(arr));
        int compare = -1;
        for (int step = 0; step < high; step++){

            if (arr[step] < pivot){
                compare++;
                swap(arr, step, compare);
            }
        }
        System.out.println(Arrays.toString(arr));
        swap(arr, compare+1, high);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[compare+1]);

       return compare+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        int pIndex = partition(arr, low, high);
        if (pIndex == 0){
            System.out.println(Arrays.toString(arr));
        }
        else{
            quickSort(arr, low, pIndex-1);
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
