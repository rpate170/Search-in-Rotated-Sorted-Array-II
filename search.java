class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
    
        
        while (l <= r) {
            int mid = l + (r-l)/2;
            
            if (target == nums[mid]){
                return true;
            }
            if (nums[mid] < nums[l] || nums[mid] < nums[r]) {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }
            else if (nums[mid] > nums[l] || nums[mid] > nums[r]) {
                    if (target < nums[mid] && target >= nums[l]) {               
                        r = mid - 1;
                    }
                    else {
                        l = mid + 1;
                    }
            }
            else {
                l++;
            }
        }
        return false;
    }
}