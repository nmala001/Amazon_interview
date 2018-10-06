/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
            ListNode helper = new ListNode(0);
            helper.next = head;
            ListNode n = helper;
        
            while(n.next != null){
                
                if(n.next.val == val){
                    ListNode p =  n.next;
                    n.next = p.next;
                }else{ 
                    n = n.next;  
                }
            }
        return helper.next;  
        }         
    }
