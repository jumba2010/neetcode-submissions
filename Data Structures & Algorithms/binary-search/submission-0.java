class Solution {
    public int search(int[] nums, int target) {
       
       int l=0,r=nums.length;
        while (l<r){ 
        int m = l + (r-l)/2;
        int middle = nums[m];
        if(middle==target) return m;
        else if (middle>target){
         r = m;
        }
        else{
        l= m+1;
        }

        }

        return -1;
    }
}
