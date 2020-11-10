open class Conta (var saldo: Double, cliente: Cliente) {

    fun depositarDinheiro(deposito: Double) : Double{
         saldo += deposito
         return saldo
    }

    open fun sacarDinheiro(sacar: Double) : Double {
        if(sacar<= saldo) {
            saldo -= sacar
            return saldo
        }
        else
            println("Saldo insuficiente")

        return -1.0
    }

    open fun consultarSaldo() : Double {
        return saldo
    }
}