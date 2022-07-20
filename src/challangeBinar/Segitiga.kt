package challangeBinar

fun Segitiga(){
    val n = 5
    for (i in 0..n){
        for (j in 0..n-i){
            print(" ")
        }
        for (k in 0..i){
            print("* ")
        }
        println("")
    }
}