import java.util.*;

public class Main {

    public static int partition(int[] arr, int low, int high){
        int midpoint = (low + high) / 2;
        int numMid = arr[midpoint];
        int tempNum = arr[high];
        arr[high] = numMid;
        arr[midpoint] = tempNum;
        System.out.println(Arrays.toString(arr));

        if (arr[high - 1] < numMid) {
            swap(arr, high - 1, midpoint);
        }
        if (low > numMid){
            swap(arr, low, midpoint);
        }

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
        int[] arr = {2, 5, 6, 3, 1, 8, 10, 9, 4, 7};

//        for(int k = 0; k < arr.length; k++){
//            arr[k] = k+1;
//        }

        System.out.println(Arrays.toString(arr));

        System.out.println(partition(arr, 0, arr.length-1));
    }

}
