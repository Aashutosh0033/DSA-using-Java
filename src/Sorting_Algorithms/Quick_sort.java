package Sorting_Algorithms;
import java.util.*;
public class Quick_sort {

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int temp;

        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i+1;
    }


    static int[] quicksort(int[] arr, int low, int high){
        int pivot;
        if(low<high){
            pivot = partition(arr,low, high);
            quicksort(arr,low,pivot-1);
            quicksort(arr, pivot+1,high);
        }

        return arr;
    }


    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }


        arr = quicksort(arr, 0,arr.length-1);

        for(int i: arr){
            System.out.println(i);
        }

    }
}

