package challangeBinar

class Diamond{
    init {
        println("Input number of row : ")
        val k = readLine()!!.toInt()
        for (i in 1..k){
            for (j in 1..(k-i)){
                print(" ")
            }
            for (j in 1 until 2*i){
                print("*")
            }
            println()
        }
        for(i in (k-1)downTo 1){
            for (j in 1..(k-i)){
                print(" ")
            }
            for (j in 1 until 2*i){
                print("*")
            }
            println()
        }
    }
}

fun DiamondPattern(){
    Diamond()
}