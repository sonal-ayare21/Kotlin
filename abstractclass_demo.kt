abstract class Employee(val name: String)  
{   						
    abstract var experience: Int              
    abstract fun salary(): Double           
    fun employeeDetails()
 {              						     
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: ${salary()}")
    }

    abstract fun dateOfBirth(date: String)    
}

class Engineer(name: String, override var experience: Int) : Employee(name)
 {
    override fun salary(): Double {
        return 500000.0
    }

    override fun dateOfBirth(date: String) {
        println("Date of Birth is: $date")
    }
}

fun main() {
    val eng = Engineer("Seema", 2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}


