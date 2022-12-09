package Sorting_Algorithms;
import java.util.*;



public class Bubble_Sort {
    public static int[] bubble_sort(int[] arr, int size){
        int temp;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(j+1 == size){
                    break;
                }
                else{
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        int[] arr2 = bubble_sort(arr,size);
        for(int i=0;i<size;i++){
            System.out.println(arr2[i]);
        }
    }
}
