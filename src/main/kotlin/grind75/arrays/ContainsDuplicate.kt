package grind75.arrays

class ContainsDuplicate {
    fun solution(nums: IntArray): Boolean {

        val map = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            if (map[num] != null) return@solution true else map[num] = num
        }
        return false
    }

}

fun main() {
    val sol = ContainsDuplicate().solution(intArrayOf(3, 9, 1, 8, 7))
    print(sol)
}