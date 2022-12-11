package Sorting_Algorithms;
import java.util.*;


//Use classes alternatively to check its implementation.
class Non_Recursive{
    public void selection_sort(ArrayList<Integer> arr){
        int minindex, temp;
        for(int i=0;i<arr.size()-1;i++){
            minindex = i;
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(j)<arr.get(minindex)){
                    minindex = j;
                }
            }
            temp = arr.get(i);
            arr.set(i,arr.get(minindex));
            arr.set(minindex,temp);

        }

        System.out.println("Non-Recursive Algorithm");
        for(Integer i : arr){
            System.out.println(i);
        }

    }
}

class Recursive{
    public void selection_sort(ArrayList<Integer> arr){
        int minindex;
        for(int i=0;i<arr.size()-1;i++){
            minindex = i;
            int j = i+1;
            minindex = find_small(j,minindex,arr);
            int temp = arr.get(i);
            arr.set(i,minindex);
            arr.set(minindex,temp);

        }

        System.out.println("Recursive Algorithm");
        for(Integer i : arr){
            System.out.println(i);
        }
    }

    public int find_small(int j, int minindex, ArrayList<Integer> arr){
        if(j>=arr.size()){
            return minindex;
        }

        if(arr.get(j) <arr.get(minindex)){
            minindex = j;
        }
        else{
            find_small(j+1,minindex,arr);
        }

        return minindex;

    }
}
public class Selection_sort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(size);

        System.out.println("Enter elements : ");
        int a;
        for(int i=0;i<size;i++){
           a = in.nextInt();
           arr.add(a);
        }

//        Non_Recursive nr = new Non_Recursive();
//        nr.selection_sort(arr);

        Recursive r = new Recursive();
        r.selection_sort(arr);

    }
}
