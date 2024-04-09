fun main(){
    //val name: String? = null
    val name: String? = "test"

    if( name != null){
        println("The length of this variable is " +
                "${name.length}")
    }

    name?.let {
        println("The length of this variable is " +
                "${name.length}")
    }

    val len = if (name != null) name.length else -1

    val length = name?.length ?: -1

    println("this item has $length")

    println("this item has length ${name!!.length}")


}