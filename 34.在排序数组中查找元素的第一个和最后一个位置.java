/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 *
 * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 *
 * algorithms
 * Medium (42.73%)
 * Likes:    2540
 * Dislikes: 0
 * Total Accepted:    879.9K
 * Total Submissions: 2.1M
 * Testcase Example:  '[5,7,7,8,8,10]\n8'
 *
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * nums 是一个非递减数组
 * -10^9 <= target <= 10^9
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] ret = {-1, -1};
      
      int i = 0, j = nums.length - 1;
      if(i > j) return ret;
      while(i <= j){
        int mid = i + (j - i) / 2;
        if(nums[mid] < target){
          i = mid + 1;
        }else{
          j = mid - 1;
        }
      }
      if(i > nums.length - 1 || nums[i] != target) return ret;

      int m = 0, n = nums.length - 1;
      while(m <= n){
        int mid = m + (n - m) / 2;
        if(nums[mid] <= target) {
          m = mid + 1;
        }else{
          n = mid - 1;
        }
      }
      ret[0] = i;
      ret[1] = m-1;
      return ret;
      // 此时i-1为>=target最左的索引
    }
}
// @lc code=end

