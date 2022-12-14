package Data_Structures;



public class LinkedList {

    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }


    }


    public static LinkedList insert(LinkedList list, int data){

        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next !=null){
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void PrintList(LinkedList list){
        Node curr = list.head;

        if(curr == null){
            System.out.println("List is Empty");
        }
        else{
            System.out.print("LinkedList : ");
            while(curr!=null){
                System.out.print(curr.data+" -> ");
                curr = curr.next;
            }
        }
    }






    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list = insert(list,6);
        list = insert(list, 7);
        PrintList(list);
    }
}
