import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
    void display(){
        System.out.println(data);
    }
}
class linkedlist{
    void append(Node hptr,int d){
        Node nptr = new Node(d);
        if(hptr == null){
            hptr = nptr;
        }
        else{
            Node temp = hptr;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nptr;
        }
    }
    public void display(Node temp){
        while(temp!=null){
            temp.display();
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
