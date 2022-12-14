package Data_Structures;
import java.util.*;


class StackOperation{
    int size,index;
    int[] arr;
    StackOperation(int size){
        this.size = size;
        arr = new int[size];
        index = -1;
    }

    public void push(int item){
        if(index==size-1){
            System.out.println("Stack Overflow");
        }
        else{
            index++;
            arr[index] = item;
        }

    }

    public void pop(){
        if(index<0){
            System.out.println("Stack Underflow");
        }

        else{
            System.out.println("Popped item: "+ arr[index--]);
        }
    }

    public void printStack(){
        for(int i=index;i>=0;i--){
            if(i == 0){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+"->");
            }
        }
        System.out.println();
    }
}

public class Stack {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of Stack : ");
        int size = in.nextInt();

        StackOperation obj = new StackOperation(size);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.printStack();
        obj.pop();
        obj.pop();
        obj.printStack();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.printStack();
    }
}
