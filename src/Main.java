import java.util.*;

public class Main {

    public static int partition(int[] arr, int low, int high) {
        int pIndex = 0;

        int midIndex = (high + low) / 2;
        int pivot = arr[midIndex];
        swap(arr, midIndex, high);

        int low_i;
        int high_i = high-1;
        int run;
        for (low_i = low; low_i < high_i; low_i++){
            if (arr[low_i] > pivot){
                run = 0;
                while(run == 0){
                    high_i--;
                    if (high_i <= low_i){
                        break;
                    }
                    if (arr[high_i] < pivot){

                        swap(arr, low_i, high_i);


                        run = 1;
                    }

                    }
                }
        }







        int count = -1;
        for (int _ : arr){
            count++;
            if (arr[count] > pivot){
                swap(arr, count, high);
                pIndex = count;


                break;
            }
        }

        return pIndex;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        if (arr.length == 0){
            System.out.println("Empty Array");
        }
        else{
            int pIndex = partition(arr, low, high);
            if (low < pIndex-1){

                quickSort(arr, low, pIndex-1);
            }
            if (pIndex+1 < high) {
               
                quickSort(arr, pIndex+1, high);
            }

            System.out.println(Arrays.toString(arr));
        }


    }

    public static void main(String[] args){
        int[] arr = {1, 5, 8, 9, 7, 10, 6, 3, 2, 4};

        int[] arr2 = {41, 42, 3, 20, 23, 6, 7, 28,
                      1, 2, 12, 11, 13, 47, 15, 27, 17, 35, 19,
                     9, 10, 22, 34, 24, 16, 26, 45, 8, 29, 50,
                     4, 21, 33, 5, 18, 14, 37, 49, 39, 40,
                    31, 32, 43, 25, 44, 46, 36, 48, 38, 30};

        int[] arr3 = new int[0];


        quickSort(arr, 0, arr.length-1);
        quickSort(arr2, 0, arr2.length-1);
        quickSort(arr3, 0, arr3.length-1);


    }

}
