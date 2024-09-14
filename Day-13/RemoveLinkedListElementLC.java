public class RemoveLinkedListElementLC {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        if(temp==null){
            return head;
        }
        if(temp.val!=val){
            head=temp;
        }
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
    public static void main(String arg[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(6);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next=new ListNode(6);
        int val=6;
        head=removeElements(head, val);

    }
}
