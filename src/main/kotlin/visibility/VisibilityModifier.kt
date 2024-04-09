package visibility

open class VisibilityModifier{

    public var a = 1
    private var b = 2
    protected var c = 3
    internal var d = 4
}

class AccessVisibilityModifiers{
    fun testAccessModifiers(){
        val visibilityModifier = VisibilityModifier()
        visibilityModifier.a
        //visibilityModifier.b private
        //visibilityModifier.c protected
        visibilityModifier.d
    }
}

class AccessProtected: VisibilityModifier(){
    fun test(){
        println(a)
        //println(b) private
        println(c)
        println(d)
    }
}