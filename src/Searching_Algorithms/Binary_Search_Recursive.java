package Searching_Algorithms;
import java.util.*;

class Algo{
    public void binary_search(int[] arr, int l, int h, int item){
        int mid = (l+h)/2;


        if(mid<0 || mid>arr.length-1){
            System.out.println("Item not found");
        }
        else if(arr[mid] == item){
            System.out.println("Item found on index : "+mid);
        }
        else if(arr[mid]>item){
            binary_search(arr,l,mid-1,item);
        }
        else if(arr[mid]<item){
            binary_search(arr,mid+1,h,item);
        }
    }
}

public class Binary_Search_Recursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = in.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        Algo obj = new Algo();
        int ind = arr.length/2;

        System.out.print("Enter item to search : ");
        int item = in.nextInt();
        int l = 0,h = arr.length-1;
        obj.binary_search(arr,l,h,item);
    }
}
