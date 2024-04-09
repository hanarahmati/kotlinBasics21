package visibility

class TestAccessModifiers {
    fun test(){
        val visibilityModifier = VisibilityModifier()
        visibilityModifier.a
        visibilityModifier.d//they are in a same package
    }
}