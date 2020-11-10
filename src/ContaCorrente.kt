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
                return limiteChequeEspecial
            }
           else {
                return saldo
            }
    }


}