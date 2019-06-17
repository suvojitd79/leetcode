/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode r = null, root = l1;
        int c = 0;
        while (l1 != null && l2 != null) {

            int d = l1.val + l2.val + c;
            if (d > 9) {
                c = 1;
                l1.val = d - 10;
            } else {
                c = 0;
                l1.val = d;
            }
            r = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {

            int d = l1.val + c;
            if (d > 9) {
                c = 1;
                l1.val = d - 10;
            } else {
                c = 0;
                l1.val = d;
            }
            r.next = l1;
            r = r.next;
            l1 = l1.next;

        }

        while (l2 != null) {

            int d = l2.val + c;
            if (d > 9) {
                c = 1;
                l2.val = d - 10;
            } else {
                c = 0;
                l2.val = d;
            }
            r.next = l2;
            r = r.next;
            l2 = l2.next;

        }

        if (c == 1) {
            r.next = new ListNode(1);
        }

        return root;
    }

}