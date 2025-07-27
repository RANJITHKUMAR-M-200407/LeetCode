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


 // ListNode prev = null;
        // ListNode temp = head;
        // while(temp.next.next!=null){
        //     ListNode temp1 = temp.next;
        //     temp.next = prev;
        //     prev =temp;
        //     temp = temp1;
      //  temp.next = prev;
       // head = temp;


        // ListNode cur = head;
        // while(cur!=null){
        //   ListNode temp = cur.next;
        //    cur.next = prev;
        //    prev = cur;
        //    cur = temp;
        // }
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode temp1=head;
         Stack<Integer> st = new Stack<>();
         while(temp1!=null){
            st.push(temp1.val);
            temp1=temp1.next;
         }
         ListNode temp2 = head;
          while(temp2!=null){
           temp2.val = st.pop();
            temp2=temp2.next;
         }
        return head;
    }
}