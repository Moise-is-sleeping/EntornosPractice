class Person() {
    var DNI = ""
    private  var Accounts = mutableListOf<Account>()

    //adds accounts as long as they are less than 3 and lets u set the accounts balance
    fun Add_Account(Account_number: Int, Account_Balance: Int) {
        val cuenta = Account()
        cuenta.Account_Number = Account_number
        cuenta.Balance = Account_Balance
        if (Accounts.size < 3) {
            Accounts.add(cuenta)
        } else {
            println("3 accounts already exist !!")
            println()
        }
    }



    fun Check_Balance(Account_number : Int) {

        for (cuenta in Accounts){
            if (Account_number == cuenta.Account_Number){
                println("Balance = ${cuenta.Balance}")
                println()
            }
        }
    }






    fun transfer(Account_number : Int) {
        println("1) Send\n2) Deposit")
        val one_two = readln().toInt()
        for (cuenta in Accounts) {
            if (Account_number == cuenta.Account_Number && one_two == 1) {
                print("Recivers Account Numbebr : ")
                val Account_number2 = readln().toInt()
                val amount = cuenta.Send()
                for (cuenta2 in Accounts) {
                    if (Account_number2 == cuenta2.Account_Number) {
                        cuenta2.Balance += amount
                    }


                }
            } else if (Account_number == cuenta.Account_Number && one_two == 2) {
                cuenta.Deposit()

            }



        }

    }
}