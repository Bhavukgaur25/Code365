package Day_0_GenericClasses;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public static void Print(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }
}
