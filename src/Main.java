import java.util.*;

public class Main {

    // Partition roughly sorts the array based on the low and high indexes
    public static int partition(int[] arr, int low, int high) {
        int pIndex = 0;

        // Sets the midpoint and pushes it to the end of the array
        int midIndex = (high + low) / 2;
        int pivot = arr[midIndex];
        swap(arr, midIndex, high);

        // Sorts through the array and compares the lower indexes with the pivot
        // If the low_i if greater than the pivot
        // It then checks whether the other end (high_i) is lower than the pivot
        // If not it goes down till there is a number that's lower than the pivot
        // If all conditions are true, it swaps the low_i and the high_i
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






        // Looks through the array and swaps the pivot back in where it's lower
        // Also counts up to return the pivot index
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

    // Swap function does basic swapping between two indexes
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // quickSort recursively calls itself till the function conditions are false
    public static void quickSort(int[] arr, int low, int high){

        // If the array is empty it prints out a string statement
        if (arr.length == 0){
            System.out.println("Empty Array");
        }
        else{
            int pIndex = partition(arr, low, high);
            // Conditions check whether the lower bounds are still less than the higher bounds, if so, recursively run quicksort
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
