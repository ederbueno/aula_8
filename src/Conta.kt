open class Conta (var saldo: Double, val cliente: Cliente) {

    fun depositarDinheiro(deposito: Double) : Double{
         saldo += deposito
         return saldo
    }

    open fun sacarDinheiro(sacar: Double) : Double {
        saldo -= sacar
         return saldo
    }

    open fun consultarSaldo() : Double {
        return saldo
    }
}