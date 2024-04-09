interface FishColors{
    val color: String
}

interface FishActions{
    fun eat()
}
/*
class Plecos: FishColors, FishActions{
    override val color: String = "gold"

    override fun eat() {
        println("eat algae")
    }

}*/

class Sharks: FishColors, FishActions{
    override val color: String = "grey"

    override fun eat() {
        println("eat fish")
    }

}

object GoldColor: FishColors{
    override val color: String = "gold"
}



class Plecos(fishColor: FishColors = GoldColor):
    FishColors by fishColor,
    FishActions by PrintingFishAction("eat algae"){

}

class PrintingFishAction(val food: String): FishActions{
    override fun eat() {
        println("$food")
    }

}