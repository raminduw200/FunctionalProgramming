object Question {
    def main(args: Array[String]): Unit = {
        print("Enter marks of 3 subjects (space separated): ");
        try {
            var marks = scala.io.StdIn.readLine().split(" ").map(_.toInt);
            var avg = marks.sum / marks.length;
            
            if (avg < 0) throw new Exception("NegativeMarks");

            println("Grade: " + getGrade(avg));
        } catch {
            case e: NumberFormatException => println("Invalid input");
            case e: Exception => println("Invalid Marks");
        }
    }

    def getGrade(avg: Int): String = {
        if (avg <= 39.0) "Fail"
        else if (avg <= 54) "Pass"
        else if (avg <= 69) "Good"
        else "Very Good"
    }
}