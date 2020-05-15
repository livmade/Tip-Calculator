import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    //Takes in the customer's meal price

    println("What was the total of your meal?: \n")
    var basePrice = readLine()!!.toDouble()
    val a = .15
    val b = .18
    val c = .20
    var tipAmount = 0.00

    print("Please enter an amount; 'B' for 15%, 'C' for 18%, 'D' for 20%: \n")
    var tipChoice = readLine().toString().toLowerCase()

    //Conditonal function that loops to calculate tip 15%, 18%, & 20%
    fun tipCalc(price: Double, tipPer: String): Double {

        if (tipChoice.equals("b")) {
            tipAmount = price * a
            println("You have chosen 15% which is $" + "%.2f".format(tipAmount) + ". \n")
        } else if (tipChoice.equals("c")) {
            tipAmount = price * b
            println("You have chosen 18% which is $" + "%.2f".format(tipAmount) + ". \n")
        } else if (tipChoice.equals("d")) {
            tipAmount = price * c
            println("You have chosen 20% which is $" + "%.2f".format(tipAmount) + ". \n")
        } else {
            println("You have entered an incorrect option, try again:")
        }
        return tipAmount
    }

    //Takes tipCalc function result, and creates total amount.

    var result = tipCalc(basePrice, tipChoice) + basePrice
    println("Based on your answers, you should pay $" + "%.2f".format(tipAmount) + " in tips. \n " +
            "So, the total bill should be $" + "%.2f".format(result) + ".")
}