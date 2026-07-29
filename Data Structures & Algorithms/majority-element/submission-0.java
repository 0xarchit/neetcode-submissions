class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0, res = 0;
        for(int i : nums){
            if(cnt == 0) res = i;
            cnt += (i == res) ? 1 : -1;
        }
        return res;
    }
}