package challangeBinar

fun SegitigaSikuSiku(){
    var i = 1
    var j = 1
    while (i <= 5){
        while (j <= i){
            print("*")
            j++
        }
        println()
        i++
        j = 1
    }
}