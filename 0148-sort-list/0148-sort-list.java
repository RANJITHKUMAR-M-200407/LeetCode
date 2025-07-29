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
    public ListNode sortList(ListNode head) {
       ListNode temp = head;
       ListNode temp2 = head;
       ArrayList<Integer> list = new ArrayList<>();
       while(temp!=null){
        list.add(temp.val);
        temp = temp.next;
       } 
       Collections.sort(list);
       int i=0;
       while(temp2!=null){
        temp2.val = list.get(i);
        i++;
        temp2 = temp2.next;
       }
       return head;
    }
}