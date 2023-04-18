package grind75.arrays

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */


class ThreeSum {

    /**
     * O(n^2)
     */
    fun threeSum1(nums: IntArray): List<List<Int>> {
        nums.sort()
        var res = HashSet<List<Int>>()

        for (i in 0 until nums.size) {
            var s = i + 1
            var f = nums.size - 1

            while (s < f) {
                val sum = nums[i] + nums[s] + nums[f]

                when {
                    sum < 0 -> s++
                    sum > 0 -> f--
                    else -> res.add(listOf(nums[i], nums[s++], nums[f]))
                }
            }
        }
        return res.toList()
    }

    /**
     * O(n^2)
     * Incorrect solution
     */
    fun threeSum2(nums: IntArray): List<List<Int>> {
        val myList = mutableListOf<List<Int>>()
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (j + 1 > nums.size - 1) break
                if (nums[i] + nums[j] + nums[j + 1] == 0) {
                    if (listOf(i, j, j + 1).toSet().size == 3 && !myList.contains(listOf(nums[i], nums[j], nums[j + 1])))
                        myList.add(listOf(nums[i], nums[j], nums[j + 1]))
                }
            }
        }
        return myList
    }
}

fun main() {
    val sol = ThreeSum().threeSum1(intArrayOf(-1, 0, 1, 2, -1, -4))
    print(sol)
}