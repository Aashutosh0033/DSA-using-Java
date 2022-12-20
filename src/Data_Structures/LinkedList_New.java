package Data_Structures;

class Linked_List{
    Node head;
    Linked_List(){
        this.head = null;
    }
    Linked_List(Node n){
        this.head = n;
    }


    public void insert(int data,int key,Linked_List list){
        Node new_node = new Node(data,key);
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node curr_node = list.head;
            while(curr_node.next!=null){
                curr_node = curr_node.next;
            }
            curr_node.next = new_node;
        }
    }

    public void delete(int key, Linked_List list){
        if(list.head == null){
            System.out.println("List is already empty");
        }
        else{
            Node curr_node = list.head;
            boolean found = false;
            while(curr_node != null ){
                if(curr_node.key == key-1){
                    found = true;
                    break;
                }
                curr_node = curr_node.next;

            }

            if(!found){
                System.out.println("Node not found");
            }
            else{

                Node temp_node = list.head;
                while(temp_node!=null){
                    if(temp_node.key == key+1){
                        break;
                    }
                    temp_node = temp_node.next;
                }

                curr_node.next = temp_node;
                System.out.println("Node deleted");
            }

        }
    }

    public void printList(Linked_List list){
        if(list.head == null){
            System.out.println("list is empty");
        }

        else{
            Node curr_node = list.head;
            System.out.println("Data-Key->");
            while(curr_node!= null){
                System.out.print(curr_node.data+"-"+curr_node.key+"->");
                curr_node = curr_node.next;
            }
        }
    }


}

class Node{
    int data;
    Node next;
    int key;
    Node(int data,int key){
        this.key = key;
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_New {
    public static void main(String[] args){
        Linked_List list = new Linked_List();
        list.insert(5,0,list);
        list.insert(19,1,list);
        list.insert(29,2,list);
        list.printList(list);
        list.delete(1,list);
        list.printList(list);
    }
}
