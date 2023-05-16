package kotlinoop.kotlinoop9inheritance

//Employee is a Person?
class Employee(private var empId:String, private var salary:Double): Person() {
    fun setEmpId(empId:String){
        this.empId = empId
    }

    fun setSaslary(salary:Double){
        this.salary = salary
    }

    fun getEmpId():String{
        return empId
    }

    fun getSalary():Double{
        return salary
    }

    fun displayEmployeeDetails(){
        println("Employee name is ${getName()}")
        println("Employee name is ${getAge()}")
        println("Employee name is ${empId}")
        println("Employee name is ${salary}")
    }
}