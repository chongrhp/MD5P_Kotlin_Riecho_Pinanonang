import java.util.Date
fun main(){
    //Personal Information
    var applyingPosition:String = "Mobile Developer"
    var desiredSalary:Double = 10000.00
    var firstName:String = "Riecho"
    var lastName:String = "Pinanonang"
    var middleName:String = "Hernandez"
    var address:String = "Rizal Street, Tinago"
    var city:String = "Bayawan City"
    var state:String = "Phil"
    var zipCode:String = "6221"
    var homePhone:String = "(035) 430-8478"
    var cellPhone:String = "0917 305 3158"
    var emailAddress:String = "chong2xrhp@gmail.com"
    var sssNumber:String = "123456780"
    var isUSCitizen:String = "No"
    var isConvictedFelony:String = "No"
    var isPreEmploymentScreening:Boolean = false

    println("Application for Employment")
    println("You are Applying For: $applyingPosition        Desired Salary: $desiredSalary\n")

    println("PERSONAL INFORMATION")
    println("First Name: $firstName\t\t\t\t\tMiddle Name: $middleName\t\t\tLast Name: $lastName")
    println("Address : $address\t\tCity: $city\t\t\t\tState: $state\t\t\tZip Code: $zipCode")
    println("Home Phone: $homePhone\t\t\tCell Phone: $cellPhone\t\tEmail Address: $emailAddress")
    println("sssNumber: $sssNumber")
    println("Are you a U.S. Citizen?: $isUSCitizen")
    println("Have you ever been convicted of a felony?: $isConvictedFelony")
    println("If selected for employment are you willing to submit to a pre-employment drug screening test? $isPreEmploymentScreening")

    //Education
    var schoolName:String = "NORSU"
    var schoolLocation:String = "Negros Oriental"
    var yearsAttended:Date = Date(2000,3,31)

    println("\nEDUCATION")
    println("School Name: $schoolName       Location: $schoolLocation   Years Attended: $yearsAttended")

    //Employment
    var employer:String = "LGU"
    var workPhone:String = "035-228-2828"
    var dateEmployed:Date = Date(2023,4,2)
    var payRate:Double = 10000.00
    var employerAddress:String = "Cab-cabon, Banga"
    var employerCityAddress:String = "Bayawan City"
    var employerState:String = "Negros Oreintal"
    var employerZip:String = "6221"
    var position:String = "Administrative Assistant III"
    var dutiesPerformed:String = "Administrative Functions"
    var supervisorName:String = "Rona O. Laurente"
    var reasonForLeaving:String = "Greener Pasture"
    var mayWeContactThem:Boolean = true

    println("\nEMPLOYMENT")
    println("Employer: $employer\t\t\t\tDates Employed: $dateEmployed")
    println("Work Phone: $workPhone\t\t\tPay Rate: $$payRate")
    println("Address: $employerAddress")
    println("City: $employerCityAddress\t\t\tState:$employerState\t\tZip:$employerZip")
    println("Position: $position")
    println("Duties Performed: $dutiesPerformed")
    println("Supervisors Name and Title: $supervisorName")
    println("Reason for leaving: $reasonForLeaving")
    println("May we contact them? $mayWeContactThem")
}