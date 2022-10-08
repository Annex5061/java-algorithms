class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int max_pro=1;
        int curr_pro=1;
        for(int i=0;i<nums.size();i++){
            curr_pro=curr_pro*nums[i];
        }
        if(curr_pro<0){
            curr_pro=1;
        }
    return max_pro;
    }