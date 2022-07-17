object Question4 {
    def calculateSalary(workingHours: Int, otHours: Int): Float = {
        var salary :Float = 250.0f;
        var ot :Float = 85.0f;
        var normalWorkHours :Float = 40.0f;
        var otWorkHours :Float = 30.0f;
        var weeklyTax :Float = 0.12f;

        return (workingHours*salary + ot*otWorkHours)*(1-weeklyTax);
    }
    def main(args: Array[String]): Unit = {
        print("Enter the working hours: ");
        var workingHours = scala.io.StdIn.readInt();
        // prompt error if working hours is greater than 40
        if (workingHours > 40) {
            println("Error: Working hours cannot be greater than 40");
        } else {
            print("Enter the overtime hours: ");
            var otHours = scala.io.StdIn.readInt();
            println("Salary: " + calculateSalary(workingHours, otHours));
        }
    }
}