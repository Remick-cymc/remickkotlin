fun main() {
    print("Enter your gross salary: ")
    val grossSalary = readLine()!!.toFloat()
    var monthlyContribution = 0.0f

    // Determine monthly contribution based on gross salary
    if (grossSalary <= 5999) {
        monthlyContribution = grossSalary * 150.00f
    } else if (grossSalary <= 7999) {
        monthlyContribution = grossSalary * 300.00f
    } else if (grossSalary <= 11999) {
        monthlyContribution = grossSalary * 400.00f
    } else if (grossSalary <= 14999) {
        monthlyContribution = grossSalary * 500.00f
    } else if (grossSalary <= 19999) {
        monthlyContribution = grossSalary * 600.00f
    } else if (grossSalary <= 24999) {
        monthlyContribution = grossSalary * 750.00f
    } else if (grossSalary <= 29999) {
        monthlyContribution = grossSalary * 850.00f
    } else if (grossSalary <= 49999) {
        monthlyContribution = grossSalary * 1000.00f
    } else if (grossSalary <= 99999) {
        monthlyContribution = grossSalary * 1500.00f
    } else {
        monthlyContribution = grossSalary * 2000.00f
    }

    // Output the result
    println("Your monthly contribution is: $${"%.2f".format(monthlyContribution)}")
}
