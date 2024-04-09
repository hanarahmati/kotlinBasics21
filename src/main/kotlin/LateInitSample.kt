import java.net.ProtocolFamily

fun main(){

    val country = Country()
    println(country.name)
    country.name = "US"
    country.setup()
    println(country.area)

}

class Country{
    var name: String = ""
    //val name: String = ""
    //we don't have lateinit val
    //lateinit val family: String
    //we can't define lateinit null
    //lateinit var family: String?
    lateinit var area: String

    fun setup(){
        area = "America"
    }
}