/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int count = 0, count1 = 0;
        ListNode temp = headA;
    	while(temp!=null) {
    	    temp = temp.next;
    	    count++;
    	}
    	ListNode temp1 = headB;
    	while(temp1!=null) {
    	    temp1 = temp1.next;
    	    count1++;
    	 }
        int delta = Math.abs(count - count1);
        if(count > count1) {
            for(int i = 0; i<delta; i++) {
                l1 = l1.next;
            }
        } else if(count < count1) {
            for(int i = 0; i<delta; i++) {
                l2 = l2.next;
            }
        }
        while(l1!=l2) {
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
    }
}
