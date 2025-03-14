import java.util.*;

public class Main {

    public static int partition(int[] arr, int low, int high){
        int midpoint = ( high + low ) / 2;
        if (arr[low] > midpoint){
            swap(arr, low, midpoint);
        }
        else if (arr[high] < midpoint){
            swap(arr, high, midpoint);
        }

        System.out.println(Arrays.toString(arr));

        return -1;
//        return -1;
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
        Random rand = new Random();
        int[] arr = new int[10];

        for(int k = 0; k < arr.length; k++){
            int num = rand.nextInt(arr.length);
            arr[k] = num;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(partition(arr, 0, arr.length));
    }

}
