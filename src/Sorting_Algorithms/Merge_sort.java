package Sorting_Algorithms;
import java.util.*;

public class Merge_sort{

    static int[] sort(int[] arr,int low, int high){

        if(low> high){
            int mid = low+(high - low)/2;
            sort(arr, low, mid);
            sort(arr,mid+1,high);

            merge(arr,)

        }



        return arr;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            in.nextInt();
        }

        sort(arr, 0,arr.length-1);
    }
}