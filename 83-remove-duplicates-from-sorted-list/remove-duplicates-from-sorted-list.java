/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode ptr = head;
        while(ptr.next!=null){
            if(ptr.val!=ptr.next.val){
                ptr=ptr.next;
            }else{
                ptr.next=ptr.next.next;
            }
        }
        return head;
    }
}