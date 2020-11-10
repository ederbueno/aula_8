class ContaCorrente (var limiteChequeEspecial: Double,saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {

    fun depositarCheque(cheque: Cheque) : Double {

        saldo += cheque.valor
        return saldo
    }
}