package Searching_Algorithms;
import java.util.*;
import java.lang.*;

public class Binary_search {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of items : ");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        int item;
        for(int i=0;i<n;i++){
            item = in.nextInt();
            list.add(item);
        }
        System.out.println(list);
    }
}
