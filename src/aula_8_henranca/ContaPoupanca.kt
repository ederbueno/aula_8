package aula_8_henranca

class ContaPoupanca (saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {
    var taxaJuros: Double = (1.5/100)

    fun recolherJuros(): Double{

      return saldo * taxaJuros


    }
}