package Searching_Algorithms;
import java.util.*;

class Algo{
    public void binary_search(int[] arr, int size, int ind,int item){
        if(ind<0 || ind>arr.length-1){
            System.out.println("Item not found");
        }
        else if(arr[ind] == item){
            System.out.println("The item is on index : "+ind);
        }
        else if(item < arr[ind]){
            binary_search(arr, size, ind-1,item);
        }
        else{
            binary_search(arr, size,ind+1,item);
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
        obj.binary_search(arr,size,ind,item);
    }
}
