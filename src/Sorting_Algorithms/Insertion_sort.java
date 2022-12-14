package Sorting_Algorithms;
import java.util.*;
public class Insertion_sort {
    static void insertion_sort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        for(int e : arr){
            System.out.println(e);
        }
    }
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements : ");

        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        insertion_sort(arr);
    }
}
