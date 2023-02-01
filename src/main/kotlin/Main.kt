fun main(){
    val person1 = Person()
    while (true) {
        print("1) Create Account\n2) Check Balance\n3) Transfer \n4) Exit \n=> ")
        val Input = readln().toInt()
        if (Input == 1) {
            print("Account Number : ")
            val ac_nmbr = readln().toInt()
            print("Account Balance : ")
            val ac_bln = readln().toInt()
            println()
            person1.Add_Account(ac_nmbr, ac_bln)


        } else if (Input == 3) {
            print("Account Number : ")
            val ac_nmbr2 = readln().toInt()
            println()
            person1.transfer(ac_nmbr2)
            println("Transfer Completed Succesfully !!")
            println()


        } else if (Input == 2) {
            print("Account Number : ")
            val ac_nmbr3 = readln().toInt()
            println()
            person1.Check_Balance(ac_nmbr3)


        } else if (Input == 4) {
            break
        }
    }

}