package aula_8_abstract

class ContaPoupanca (saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {
    var taxaJuros: Double = (1.5/100)

    fun recolherJuros(): Double{

      return saldo * taxaJuros


    }

    override fun depositarDinheiro(deposito: Double): Double {
        saldo += deposito
        return saldo
    }

    override fun sacarDinheiro(sacar: Double): Double {
        if(sacar<= saldo) {
            saldo -= sacar
            return saldo
        }
        else
            println("Saldo insuficiente")
        return -1.0
    }

    override fun consultarSaldo(): Double {
        return saldo
    }
}