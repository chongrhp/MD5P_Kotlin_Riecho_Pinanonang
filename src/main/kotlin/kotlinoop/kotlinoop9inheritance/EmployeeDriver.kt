package kotlinoop.kotlinoop9inheritance

fun main(){
    var employee1 = Employee("0001", 2000.00)
    employee1.setName("Peter Parker")
    employee1.setAge(31)
    employee1.displayEmployeeDetails()

    val manager = Manager()
    manager.setName("Clark Kent")
    manager.setAge(25)
    println("Manager name is ${manager.getName()}")
    println("Manager name is ${manager.getAge()}")
    manager.managerPeople()
}