
/*
Rs 15.00 per ticket = 120 people attend 
Rs. 10 = attendance 140
Rs. 20 = attendance 100. 
performance costs = Rs.500. 
attendee costs = 3 Rupees. 
*/
object Question4 {
    val performanceCost = 500;
    val attendeeCost = 3;
    def main(args: Array[String]): Unit = {
        println("The best ticket price is " + bestTicketPrice(10, 140, 0));
    }
    def bestTicketPrice(
                        ticketPrice: Float, 
                        attendance: Int,
                        oldProfit: Float): Float = {
                            val totalCost = performanceCost + (attendance * attendeeCost);
                            val newProfit = (ticketPrice * attendance) - totalCost;

                            if (oldProfit < newProfit) {
                                bestTicketPrice(ticketPrice + 5, attendance - 20, newProfit);
                            } else {
                                ticketPrice - 5;
                            }
                        }
}