/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
  public int search(int[] nums, int target) {
    int i = 0, j = nums.length; // 1.
    while (i < j) { // 2. 如果是 i<=j j 会一直等于m 会陷入死循环嘞
      int m = (i + j) / 2;
      if (target < nums[m]) {
        j = m; // 3.
      } else if (nums[m] < target) {
        i = m + 1;
      } else {
        return m;
      }
    }
    return (int) -1;
  }
}
// @lc code=end
