import challangeBinar.*

fun main(){
    println("""
        ===============
        Binar Challange
        ===============
        
        1. Segitiga
        2. Segitiga terbalik
        3. Diamond
        4. X pattern
        5. Segitiga siku-siku
        
        Pilih pola :
    """.trimIndent())
    val menu = readLine()!!.toInt()

    if (menu == 1){
        Segitiga()
    }
    else if (menu == 2){
        SegitigaTerbalik()
    }
    else if (menu == 3){
        DiamondPattern()
    }
    else if (menu == 4){
        Xpattern()
    }
    else if (menu == 5){
        SegitigaSikuSiku()
    }
    else{
        println("inputan tidak valid")
    }
}