open class Conta (var saldo: Double, val cliente: Cliente) {

    fun depositarDinheiro(deposito: Double) : Double{
         saldo += deposito
         return saldo
    }

    fun sacarDinheiro(sacar: Double) : Double {
        saldo -= sacar
         return saldo
    }

    fun consultarSaldo() : Double {
        return saldo
    }
}