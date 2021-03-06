package aula_8_abstract

import aula_8_henranca.Cheque
import aula_8_henranca.Cliente
import aula_8_henranca.ContaCorrente
import java.util.*

fun main() {

    /*  var cliente1 = aula_8_henranca.Cliente(2,"Bueno", 444444444, 333333333)
  var dadosConta = aula_8_henranca.ContaPoupanca(5000.00, cliente1)
  dadosConta.depositarDinheiro(100.00)
  dadosConta.sacarDinheiro(10.00)
  dadosConta.recolherJuros()
  println("Juros: " + dadosConta.recolherJuros())
  println("Saldo: " + dadosConta.consultarSaldo())*/

    var cliente2 = Cliente(3,"Ferreira", 5555555, 666666666)
    var dadosContacliente2 = ContaCorrente(1000.00, -20.00, cliente2)
    var data = Date()
    var depositoCheque = Cheque(0.00, "Santander", data)
    dadosContacliente2.depositarDinheiro(0.00)
    dadosContacliente2.depositarCheque(depositoCheque)
    dadosContacliente2.sacarDinheiro(200.00)
    println("Saldo: " + dadosContacliente2.consultarSaldo())

}

