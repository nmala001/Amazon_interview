/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode p = head;
        
        //Traversing through all the elements till one of them becomes null
        
        while(l1 != null || l2 !=null){
            
            if(l1 != null && l2!=null ){
                if(l1.val < l2.val){
                    p.next = l1;
                    l1 = l1.next;
                }else{
                    p.next = l2;
                    l2 = l2.next;
                } 
                p =  p.next;
            }else if(l1 == null){
                p.next = l2;
                break;
            }else if(l2 == null){
                p.next = l1;
                break;
            }
        }
        return head.next;
    }
}
