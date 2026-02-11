class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;

        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            st.push(temp);
            temp = temp.next;
            size++;
        }

        ListNode curr = head;


        for (int i = 0; i < size / 2; i++) {
            ListNode nodeToInsert = st.pop();
            nodeToInsert.next = curr.next;
            curr.next = nodeToInsert;
            curr = curr.next.next;
        }

        curr.next = null;
    }
}
