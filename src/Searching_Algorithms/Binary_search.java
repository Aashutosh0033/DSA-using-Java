package Searching_Algorithms;
import java.util.*;
import java.lang.*;

public class Binary_search {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int s_item = 1; //Search Element

        System.out.println("Enter number of items : ");
        int n = in.nextInt();

        //Creating an Arraylist
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        int item;

        //Adding items to list in sorted manner
        for(int i=0;i<n;i++){
            item = in.nextInt();
            list.add(item);
        }

        //initializing the mid-index
        int ind = list.size()/2;
        boolean found = false;

        while(ind>=0 && ind<list.size()){
            if(list.get(ind) == s_item){
                System.out.println("Item is on index : "+ind);
                found = true;
                break;

            }
            else if(list.get(ind)>s_item){
                ind--;
            }

            else if(list.get(ind)<s_item){
                ind++;
            }
        }

        if(!found){
            System.out.println("Item not found");
        }

    }
}
