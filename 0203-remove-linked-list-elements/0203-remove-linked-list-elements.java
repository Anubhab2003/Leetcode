class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the head of the list should be removed.
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
}
