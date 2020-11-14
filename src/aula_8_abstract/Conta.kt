package aula_8_abstract

abstract class Conta (var saldo: Double, cliente: Cliente) {

    abstract fun depositarDinheiro(deposito: Double) : Double

    abstract fun sacarDinheiro(sacar: Double) : Double

    abstract fun consultarSaldo() : Double

}