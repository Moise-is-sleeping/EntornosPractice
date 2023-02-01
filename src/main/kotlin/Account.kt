class Account() {
    var Account_Number = 0
    var Balance = 0
        set(value) {
            field = value
            if (value < 0){
                println("Your accounts is in the red !!")
                println()

            }
        }
    fun Send(): Int{
        print("Amount : ")
        val amount = readln().toInt()
        Balance -= amount
        return amount
    }
    fun Deposit(){
        print("Amount : ")
        val amount = readln().toInt()
        Balance += amount
    }




}