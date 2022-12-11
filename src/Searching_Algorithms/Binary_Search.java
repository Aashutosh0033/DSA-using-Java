package Searching_Algorithms;
import java.util.*;


//use classes alternatively to check its implementation
class Recursive{
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

class Non_Recursive{


    public void binary_search(int[] arr, int item){
        System.out.println("Non_Recursive method");
        int l = 0, h = arr.length-1;
        int mid = (l+h)/2;
        boolean found = false;

        while(mid>=0 && mid<arr.length){
            if(arr[mid]==item){
                System.out.println("Item is on index : "+mid);
                found = true;
                break;
            }
            else if(item < arr[mid]){
                h = mid-1;
                mid = (l+h)/2;
            }
            else{
                l = mid+1;
                mid = (l+h)/2;
            }
        }

        if(!found){
            System.out.print("Item not found");
        }


    }
}

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = in.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter item to search : ");
        int item = in.nextInt();


        Recursive r = new Recursive();
        int ind = arr.length/2;
        int l = 0,h = arr.length-1;
        System.out.println("Recursive method");
        r.binary_search(arr,l,h,item);

//        Non_Recursive nr = new Non_Recursive();
//        nr.binary_search(arr,item);


    }

}
