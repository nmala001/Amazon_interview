class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            
            return null;
        }else if(val==0){
            
            return head.next;
            
        }else{
            ListNode n = head;
            for(int i=0;i<val-1; i++){
                
                n = n.next;
            }
             n.next = n.next.next;
           
        }
        
        return head;
    }
}
