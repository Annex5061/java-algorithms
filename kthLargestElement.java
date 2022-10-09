class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : nums){
            pq.add(i);
        }
        
        int res = 0;
        
        while(k-- > 0){
            res = pq.poll();
        }
        
        
        return res;
    }
}
