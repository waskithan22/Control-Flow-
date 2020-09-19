public enum class Player (val value: Int){
    MAhessa(45),
    Gintara(74),
    dwI(130),
    //ROsliyadi(999999999),
    Magiro(200)
}

fun main() {

    for (i in 0..3){//nyari total entry di enum gatau caranya :v
        val getData :Player = Player.values()[i]
        print("${getData.ordinal} $getData ${getData.value} ")
        if (getData.value < 50){
            println("Bronze")
        }else if (getData.value < 100){
            println("Silver")
        }else if (getData.value < 150){
            println("Gold")
        }else println("Legend")

    }

}