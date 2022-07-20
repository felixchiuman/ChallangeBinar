package challangeBinar

fun Xpattern(){
    val n=5
    for (i in 1..n){
        for(j in 1..n){
            if(i==j || i+j==6){
                print("X")
            }
            else{
                print(" ")
            }
        }
        println()
    }
}