package aula_8_abstract

class ContaCorrente (var limiteChequeEspecial: Double, saldo: Double, cliente: Cliente)
    : Conta(saldo, cliente) {

    fun depositarCheque(cheque: Cheque) : Double {

        saldo += cheque.valor
        return saldo
    }

    override fun depositarDinheiro(deposito: Double): Double {
        saldo += deposito
        return saldo
    }

    override fun sacarDinheiro(sacar: Double) : Double {

            if(saldo < 0) {
                limiteChequeEspecial -= sacar
                if(limiteChequeEspecial < 0)
                    println("Limite de cheque especial foi execedido, não é possível realizar o saque")
                else {
                    limiteChequeEspecial +=saldo
                    println("Limite cheque especial:" + limiteChequeEspecial)
                    saldo -=sacar
                    return limiteChequeEspecial
                }
            }
           else if (saldo > sacar) {
                    saldo -= sacar
                    println("Saldo aula_8_henranca.Cliente 2: " + consultarSaldo())
                    return saldo
                }else{
                    limiteChequeEspecial -= sacar
                if(limiteChequeEspecial < 0) {

                    println("Limite de cheque especial foi execedido, não é possível realizar o saque")
                }else{
                    limiteChequeEspecial +=saldo
                    println("Limite cheque especial:" + limiteChequeEspecial)
                    saldo -=sacar
                    return limiteChequeEspecial
                }
            }
              return -1.0
    }

    override fun consultarSaldo(): Double {
        return saldo
    }
}