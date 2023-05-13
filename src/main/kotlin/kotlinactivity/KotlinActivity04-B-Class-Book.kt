package kotlinactivity
fun main(){
    var books = ArrayList<Book>()
}

class Book(
    var title:String,
    var author:String,
    var yearPublished: Int,
    var edition:String,
    var ISBN: String,
    var publisher:String,
    var chapters:List<String>,
    var pages:Int)

class Magazine(
    var editor:String,
    var title:String,
    var monthPublished:String,
    var yearPublished:String)

class NewsPapers(
    var name: String,
    var dayPublished:Int,
    var monthPublished:Int,
    var yearPublished:Int,
    var headline:String)

class Authors(
    var firstName: String,
    var lastName: String,
    var middleName:String,
    var dateOfBirth:String)

class Comics(
    var title:String,
    var monthPublished:String,
    var yearPublished:Int,
    var illustrators:String,
    var publisher:String)

class Article(
    var title:String,
    var content:String,
    var author:String)

class MediaRecording(
    var title:String,
    var lengths:String,
    var dateRecorded:String)

class Publisher(
    var name:String,
    var address: String,
    var dateEstablished:String)
fun searchText(search:String):String {
    println("Enter word to search: ")
    val searchText = readln()
    return searchText
}

//magazine, newspaper, comics or book, author
fun listMagazines(list:ArrayList<Magazine>){
    println("**** List of all Magazines ***")
    for(magazine in list){
        println("Title: ${magazine.title},\t"+
                "Editor: ${magazine.editor},\t"+
                "Published: ${magazine.monthPublished},"+
                "${magazine.yearPublished}")
    }
}

fun listNewsPapers(list:ArrayList<NewsPapers>){
    println("*** List of all News papers ***")
    for(news in list){
        println("Name: ${news.name},\t"+
                "Headline: ${news.headline},\t"+
                "Date Published: ${news.monthPublished}/"+
                "${news.dayPublished}/${news.yearPublished}")
    }
}

fun listComics(list:ArrayList<Comics>){
    println("*** List of all Comics ***")
    for(comic in list){
        println("Title: ${comic.title},\t"+
        "${comic.publisher},\t"+
        "Published: ${comic.monthPublished}, ${comic.yearPublished},\t"+
        "Illustrators: ${comic.illustrators}")
    }
}

fun listBooks(list:ArrayList<Book>){
    println("*** List of Books ***")
    for(book in list){
        println("Title: ${book.title},\t"+
        "ISBN: ${book.ISBN}, \t"+
        "Edition: ${book.edition},\t"+
        "Author: ${book.author},\t"+
        "Chapter: ${book.chapters},\t"+
        "Pages: ${book.pages},\t"+
        "Publisher: ${book.publisher},\t"+
        "Year Published: ${book.yearPublished}")
    }
}

fun listAuthors(list:ArrayList<Authors>){
    println("*** list of Authors *** ")
    for(author in list){
        println("Name: ${author.firstName} "+
        "${author.middleName.first()}. "+
        "${author.lastName},\t"+
        "Birthdate: ${author.dateOfBirth}")
    }
}
fun searchMagazines(search:String, list:ArrayList<Magazine>){
    for (magazine in list){
        if(magazine.title.uppercase().contains(search.uppercase())){
           println("Title: ${magazine.title},\t"+
           "Editor: ${magazine.editor},\t"+
           "published: ${magazine.monthPublished},"+
           "${magazine.yearPublished}")
        }
    }
}

fun searchNewsPapers(search:String, list:ArrayList<NewsPapers>){
    for (news in list){
        if(news.headline.uppercase().contains(search.uppercase())){
            println("Name: ${news.name},\t"+
                    "Headline: ${news.headline},\t"+
                    "Date Published: ${news.monthPublished}/"+
                    "${news.dayPublished}/${news.yearPublished}")
        }
    }
}

fun searchComics(search:String, list:ArrayList<Comics>){
    for(comic in list){
        if(comic.title.uppercase().contains(search.uppercase())){
            println("Title: ${comic.title},\t" +
                    "Illustrator: ${comic.illustrators},\t"+
                    "Published: ${comic.monthPublished}," +
                    " ${comic.yearPublished}\t"+
                    "Publisher: ${comic.publisher}")
        }
    }
}