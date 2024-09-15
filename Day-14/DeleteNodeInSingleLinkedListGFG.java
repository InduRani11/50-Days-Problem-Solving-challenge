

public class DeleteNodeInSingleLinkedListGFG {
// Linklist node structure
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Node deleteNode(Node head, int x) {
        int n=2;
        Node temp=head;
        if(x==1){
            return temp.next;
        }
        else{
            head=temp;
        }
        while(temp!=null){
            if(n==x){
                temp.next=temp.next.next;
            }
            temp=temp.next;
            n++;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(5);
        head.next.next=new Node(2);
        head.next.next.next=new Node(9);
        head=deleteNode(head,2);
    }
}
