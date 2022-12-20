package Sorting_Algorithms;
import java.util.*;

public class Merge_sort{

    static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[mid+1+j];
        }
        int i =0, j=0;
        int k = low;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] =   L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

        for(int p : arr){
            System.out.println(p);
        }

    }

    static void sort(int[] arr,int low, int high){

        if(low < high){
            int mid = low+(high - low)/2;
            sort(arr, low, mid);
            sort(arr,mid+1,high);

            merge(arr,low,mid,high);


        }

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