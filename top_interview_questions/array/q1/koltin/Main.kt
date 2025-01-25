fun main() {
    test1()
    test2()
    test3()
    test4()
}

fun pretyPrint(nums: IntArray, k: Int) {
    println("k = $k nums = [ ${nums.take(k).joinToString()} ]")
}

fun test1() {
    val nums = intArrayOf(1, 1, 2)
    val k = removeDuplicates(nums)
    pretyPrint(nums, k)
}

fun test2() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val k = removeDuplicates(nums)
    pretyPrint(nums, k)
}

fun test3() {
    val nums = intArrayOf(1)
    val k = removeDuplicates(nums)
    pretyPrint(nums, k)
}

fun test4() {
    val nums = intArrayOf()
    val k = removeDuplicates(nums)
    println("k = $k nums = ${nums.take(k).joinToString()}")
}

fun removeDuplicates(nums: IntArray): Int {
    val size = nums.size
    if (size == 0) {
        return 0
    }
    var k = 1
    for (i in 1..size - 1) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}
