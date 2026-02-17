fun main() {
    var newChild=Child();
    //newChild.Parentfunction()
    //newChild.Childfunction()
  
}

open class Parent()
{
    init
    {
        
        println("This is parent class function")
    }
}
class Child:Parent()
{
    init
    {
        
        println("This is child class function")
    }
}
