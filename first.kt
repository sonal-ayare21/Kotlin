fun main() {

    var newChild=Child();
    newChild.Parentfunction()
    newChild.Childfunction()
  
}

open class Parent()
{
    var name:String=""
    var age:Int=0
    
    fun Parentfunction()
    {
        
        println("This is parent class function")
    }
}
class Child:Parent()
{
    var name2:String=""
    var age2:Int=0
    
    fun Childfunction()
    {
        
        println("This is Child class function")
    }
}
