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

    int gcd(int x,int y) {
        // if(y == 0) return x;
        // return gcd(y, x % y);
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
      
        ListNode prev = head;
        ListNode sec = prev.next;

        while(sec != null) {
            int val = gcd(prev.val,sec.val);
            ListNode temp = new ListNode(val);
            prev.next = temp;
            temp.next = sec;
            prev = sec;
            sec = sec.next;
        }   
        return head;
    }
}