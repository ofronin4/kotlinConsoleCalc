class Calculations ():Digits() {
    fun ChOption() {
        digits()
        var result = 0.0
        println("enter option:\n1)Plus  \"+\" \n1)Minus  \"-\" \n3)Multiply  \"*\" \n4)Divide  \"/\" ")
        var userOption = readLine()

        when (userOption) {
            "1", "plus", "Plus", "+" -> {result = firstNumber + secondNumber;
                userOption = "summarization" }
            "2", "minus", "Minus", "-" -> {result = firstNumber - secondNumber;
                userOption = "subtraction"}
            "3", "multiply", "Multiply", "*" -> {
                result = firstNumber * secondNumber;
                userOption = "multiplication"
            }
            "4", "divide", "Divide", "/" -> {
                result = firstNumber / secondNumber;
                userOption = "division"
            }
        }
        println("Result of $userOption of $firstNumber and $secondNumber is:  $result")
    }
}