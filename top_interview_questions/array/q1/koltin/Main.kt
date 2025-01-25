data class TestCase(
        val input: IntArray, // Входной массив
        val expectedOutput: IntArray // Ожидаемый результат
)

fun testRemoveDuplicates(testCases: Array<TestCase>) {
    var countFailed = 0
    for ((index, testCase) in testCases.withIndex()) {
        val inputCopy = testCase.input.copyOf() // Создаем копию массива, чтобы не менять оригинал
        val resultSize = removeDuplicates(inputCopy)

        val resultArray =
                inputCopy.take(resultSize).toIntArray() // Берем первые resultSize элементов
        val isCorrect = resultArray.contentEquals(testCase.expectedOutput)
        if (!isCorrect) countFailed++

        println("Test case #$index:")
        println("Input: [ ${testCase.input.joinToString()} ]")
        println("Expected: [ ${testCase.expectedOutput.joinToString()} ]")
        println("Actual: [ ${resultArray.joinToString()} ]")
        println("Result: ${if (isCorrect) "PASS" else "***FAIL***"}")
        println()
    }
    if (countFailed > 0) println("**** Failed $countFailed out of ${testCases.size} test cases")
    else println("All test cases passed")
}

fun main() {
    val testCases =
            arrayOf(
                    TestCase(intArrayOf(1, 1, 2), intArrayOf(1, 2)), // Убираем дубликаты
                    TestCase(
                            intArrayOf(0, 0, 1, 1, 2, 2, 3, 3, 4),
                            intArrayOf(0, 1, 2, 3, 4)
                    ), // Пример длинного массива
                    TestCase(intArrayOf(), intArrayOf()), // Пустой массив
                    TestCase(intArrayOf(1), intArrayOf(1)), // Один элемент
                    TestCase(intArrayOf(1, 1, 1, 1), intArrayOf(1)) // Все одинаковые
            )
    testRemoveDuplicates(testCases)
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var k = 1
    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}
