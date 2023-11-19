/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 *
 * https://leetcode.cn/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (44.81%)
 * Likes:    550
 * Dislikes: 0
 * Total Accepted:    246.7K
 * Total Submissions: 550.5K
 * Testcase Example:  '16'
 *
 * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * 
 * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
 * 
 * 不能使用任何内置的库函数，如  sqrt 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：num = 16
 * 输出：true
 * 解释：返回 true ，因为 4 * 4 = 16 且 4 是一个整数。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：num = 14
 * 输出：false
 * 解释：返回 false ，因为 3.742 * 3.742 = 14 但 3.742 不是一个整数。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= num <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
// 二分查找优化
class Solution {
  public boolean isPerfectSquare(int num) {
      int low=1,high=num;
      while(low<high){
          int mid=low+(high-low)/2;
          if(mid<num/mid){
              low=mid+1;
          }else{
              high=mid;
          }
      }
      return high*high==num;
  }
}


// @lc code=end


// 1. 二分查找法 ！！Time Limit Exceeded！！
// class Solution {
//     public boolean isPerfectSquare(int num) {
//       int i = 1, j = num;

//       while(i <= j){
//         int mid = (i + j) >>> 1;
//         int square = mid * mid;
//         if (square < num){
//           i = mid + 1;
//         }else if(square > num){
//           j = mid - 1;
//         }else{
//           return true;
//         }
//       }
//       return false;
//     }
// }

// 2. Time Limit Exceeded
// class Solution {
//     public boolean isPerfectSquare(int num) {
//       int i = 1;
//       while(i * i < num) i++;
//       return i * i == num;
//     }
// }
