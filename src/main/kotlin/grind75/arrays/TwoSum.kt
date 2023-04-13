package grind75.arrays

import java.lang.IllegalStateException

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

/**
 * Approach #1
 * O(n^2)
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                println("${nums[i]} + ${nums[j]} = ${nums[i] + nums[j]}")
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }

        return intArrayOf(1)
    }
}

/**
 * Approach #2
 * O(n)
 * https://docs.google.com/document/d/1XEL6vhYCfucVoZ6GJaHpkkTj88LzCGqeBXsjt0ten10/edit?usp=sharing
 */
class Solution2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for ((i, v) in nums.withIndex()) {

            val diff = target - v

            map[diff]?.let { return@twoSum intArrayOf(i, map[diff]!!) }

            map[v] = i
        }

        throw IllegalStateException("Not found")
    }
}

fun main() {
    val sol = Solution2().twoSum(intArrayOf(1, 2, 3, 4), 6)
    sol.forEach { print("${it},") }
}