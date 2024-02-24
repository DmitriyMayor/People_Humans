fun main(){
    var likes = readln()
    //пока сделал переменную с вводом из консоли

    if (likes.takeLast(1).equals("0")){
        var people = "человек"
        println("Понравилось $likes $people")
    } else if (likes.takeLast(1).equals("0")){
        var people = "человеку"
        println("Понравилось $likes $people")
    }else {
        var people = "человекам"
        println("Понравилось $likes $people")
    }


}