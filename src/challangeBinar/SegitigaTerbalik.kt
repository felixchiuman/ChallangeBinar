package challangeBinar

fun SegitigaTerbalik(){
    val m = 6
    var x = m
    var y : Int

    while (x>0){
        y=0

        while(y++ < m-x){
            print(" ")
        }
        y = 0

        while (y++ < x){
            print(" *")
        }
        println("")
        x--
    }
}