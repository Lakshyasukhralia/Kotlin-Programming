package grind75.arrays

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */

class MajorityElement {
    fun solution(nums: IntArray): Int {

        val map = mutableMapOf<Int, Int>()
        var max = 0
        var maxIndex = 0

        for (i in nums.indices) {
            if (map[nums[i]] != null) {
                map[nums[i]] = map[nums[i]]!! + 1

                if (map[nums[i]]!! > max) {
                    max = map[nums[i]]!!
                    maxIndex = i
                }
            } else {
                map[nums[i]] = 1
            }
        }
        return nums[maxIndex]
    }

}

fun main() {
    val sol = MajorityElement().solution(intArrayOf(3, 2, 3))
    print(sol)
}