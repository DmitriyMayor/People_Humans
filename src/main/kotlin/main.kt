fun main(){
    val likes = readln()
    //пока сделал переменную с вводом из консоли

    if (likes.toInt() == 0 || likes.takeLast(3).equals("000")){
        val people = "человек"
        println("Понравилось $likes $people")
    } else if (likes.takeLast(1).equals("1")&& !likes.takeLast(2).equals("11")){
        val people = "человеку"
        println("Понравилось $likes $people")
    } else {
        val people = "людям"
        println("Понравилось $likes $people")
    }
}
//println("Понравилось $likes $people")
//likes.takeLast(1).equals("0")