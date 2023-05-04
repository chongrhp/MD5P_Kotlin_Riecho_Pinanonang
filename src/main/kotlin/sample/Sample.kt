package sample

fun main() {
    val size = 5
    val square = Array(size) { IntArray(size) }
    val magicSum = (size * (size * size + 1)) / 2 // Calculate the magic sum

    var row = size - 1
    var col = size / 2
    square[row][col] = 1 // Assign the center cell of the top row to 1

    for (i in 2..size * size) {
        if (square[(row + 1) % size][(col + 1) % size] == 0) { // If the cell diagonally down and to the right is empty
            row = (row + 1) % size
            col = (col + 1) % size
        } else { // Otherwise, move one cell up
            row = (row - 1 + size) % size
        }
        square[row][col] = i
    }

    // Print the magic square
    for (i in 0 until size) {
        for (j in 0 until size) {
            print("${square[i][j]} ")
        }
        println()
    }
}