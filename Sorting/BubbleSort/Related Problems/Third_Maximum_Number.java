//LeetCode Link: https://leetcode.com/problems/third-maximum-number/

//Solution Refrence Links: https://www.tutorialcup.com/leetcode-solutions/third-maximum-number-leetcode-solution.htm

//Aproach: sorted array with bubble sort and then find third element

class Solution {
    public int thirdMax(int[] nums) {
        int ans = nums[nums.length - 1];
       
        for(int i = 0; i < nums.length; i++){
            boolean swapped = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j - 1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            
            if(!swapped){
                break;
            }
        }
        
        // we will be geting sorted array above is bubble sort
        int index = nums.length - 1, count = 0, j = 0; 
        while(index >= 0){
            j = index - 1;
            count++;
            while(j >= 0 && nums[index] == nums[j]){ 
                j--;
            }
            if(j == -1){
                return nums[nums.length - 1];
            }
            index = j;
            if(count == 2){
                break;
            }
            
            
        }
        
        
        
        return nums[index];
    }
}