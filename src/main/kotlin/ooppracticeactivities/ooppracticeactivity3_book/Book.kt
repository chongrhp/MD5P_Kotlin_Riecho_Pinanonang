package ooppracticeactivities.ooppracticeactivity3_book

class Book(var title:String, var author:String, var year:String) {
    fun printDetails(){
        println("Book Title: $title")
        println("Author: $author")
        println("Year: $year")
    }
}