

public class MiddleLinkedListLC {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; this.next=null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode head;
    public static ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null &&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public static void main(String[] args) {
        head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        System.out.println(middleNode(head));
    }
}
