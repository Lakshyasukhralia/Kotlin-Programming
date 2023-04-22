package grind75.arrays

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */
class MaxArea {
    fun solution(nums: IntArray): Int {
        var l = 0
        var r = nums.size - 1
        var max = 0

        while (l != r) {
            val area = minOf(nums[l], nums[r]) * (r - l)
            max = maxOf(max, area)
            when {
                nums[l] > nums[r] -> r--
                nums[l] < nums[r] -> l++
                else -> l++
            }
        }
        return max
    }
}

fun main() {
    val sol = MaxArea().solution(intArrayOf(3, 9, 1, 8, 7))
    print(sol)
}