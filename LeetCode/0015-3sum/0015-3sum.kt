class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        
        var sum = 0
        val triplets = mutableListOf<List<Int>>()
        
        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            var left = i + 1
            var right = nums.size - 1
            
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right]
                
                if (sum < 0) left++
                if (sum > 0) right--
                if (sum == 0) {
                    triplets.add(listOf(nums[i], nums[left], nums[right]))
                    
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--
                    
                    left++
                    right--
                }
            }
        }
        
        return triplets
    }
}