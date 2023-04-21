package grind75.arrays

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

class ProductExceptSelf {
    fun solution1(nums: IntArray): IntArray {
        val n = nums.size
        val answer = IntArray(n)

        // calculate the products of all elements to the left of nums[i]
        var leftProduct = 1
        for (i in 0 until n) {
            answer[i] = leftProduct
            leftProduct *= nums[i]
        }

        // calculate the products of all elements to the right of nums[i]
        var rightProduct = 1
        for (i in n-1 downTo 0) {
            answer[i] *= rightProduct
            rightProduct *= nums[i]
        }

        return answer
    }
}

fun main() {
    val sol = ProductExceptSelf().solution1(intArrayOf(1,2,3))
    for (i in sol) {
        print("$i,")
    }
}