class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        //Insert every single element into the queue
        
        //Reordering of the queue is going to take logk time since the size is k here
        
        //PriorityQueue is sorted in natural order which is ascending order
        
        
        
        //push all the numbers into the queue
        
        //In priority queue all the elements get sorted order that is ascending order
        
        
        for(int num: nums){
            
            queue.add(num);
            
            if(queue.size()>k){
                
                queue.poll();
            }  
        }
        return queue.peek();
    }
}
