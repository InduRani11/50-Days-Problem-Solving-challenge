

public class RemoveDuplicateFromSortedListLC {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null||head.next==null){
            return head;
        }
        while(temp.next!=null&&temp!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(3);
        ListNode ans=deleteDuplicates(head);
    }
}
