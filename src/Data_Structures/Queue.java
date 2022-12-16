package Data_Structures;
import java.util.Scanner;

class QueueOperation{
    int size;
    int low,high;
    int[] arr;

    QueueOperation(int size){
        this.size = size;
        arr = new int[this.size];
        low = -1;
        high = low;

    }

    public void enqueue(int data){
        if(high == size-1){
            System.out.println("Queue Overflow");
        }
        else if(low == -1){
            low++;
            high++;
            arr[high] = data;
        }
        else{
            high++;
            arr[high] = data;
        }

    }


    public void dequeue(){
        if(low == -1){
            System.out.println("Queue underflow");
        }
        else if(low == high ){
            System.out.println("Popped item : " + arr[low]);
            low--;
            high--;
        }

        else{
            System.out.println("Popped item : " + arr[low]);
            for(int i=low+1;i<=high;i++){
                arr[i-1] = arr[i];
            }
            high--;
        }
    }

    public void printQueue(){
        for(int i=high;i>=low;i--){
            System.out.print(arr[i]+"->");
        }
        System.out.println();
    }
}
public class Queue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of the queue : ");
        int size = in.nextInt();

        QueueOperation obj = new QueueOperation(size);

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.printQueue();
        obj.dequeue();
        obj.dequeue();
        obj.printQueue();
        obj.enqueue(7);
        obj.enqueue(8);
        obj.printQueue();

    }
}
