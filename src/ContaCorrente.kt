class ContaCorrente (var limiteChequeEspecial: Double,saldo: Double, cliente: Cliente)
    : Conta(saldo, cliente) {

    fun depositarCheque(cheque: Cheque) : Double {

        saldo += cheque.valor
        return saldo
    }

    override fun sacarDinheiro(sacar: Double) : Double {
            saldo -= sacar
            if(saldo < 0) {
                limiteChequeEspecial += saldo
                if(limiteChequeEspecial < 0)
                    println("Limite de cheque especial foi execedido, não é possível realizar o saque")
                else {
                    println("Limite cheque especial:" + limiteChequeEspecial)
                    return limiteChequeEspecial
                }

            }
           else {
                println("Saldo Cliente 2: " + consultarSaldo())
                return saldo
            }
              return -1.0

    }

}