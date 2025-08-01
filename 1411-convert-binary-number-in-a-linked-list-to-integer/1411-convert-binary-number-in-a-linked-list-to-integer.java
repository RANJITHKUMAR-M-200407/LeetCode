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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.append(String.valueOf(temp.val));
           // num=(num*2)+temp.val;
            temp=temp.next;
        }
        int ans = Integer.parseInt(sb.toString(),2);
        return ans;

    }
}