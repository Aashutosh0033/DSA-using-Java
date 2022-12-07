package Searching_Algorithms;
import java.util.*;
import java.lang.*;

public class Linear_search {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        int s_item = 2;

        System.out.print("Enter size of the list : ");
        int size = in.nextInt();
        System.out.println();

        //Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(size);

        //Adding Items to it in any manner
        for(int i=0;i<size;i++){
            System.out.print("Enter element no. "+i+" : ");
            list.add(in.nextInt());
        }

        boolean found = false;


        //Linearly traversing through list to search the element
        for(int i=0;i<list.size();i++){
            if(list.get(i) == s_item){
                System.out.println("The item in on index : "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Item not found");
        }

    }
}
