fun main() {
    print(solution(10, 2))
}

fun solution(n: Int, firstNumber: Int): Int {
    return (firstNumber + (n / 2)) % n
}
