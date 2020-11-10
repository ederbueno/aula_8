import java.util.*

fun main() {

    var cliente1 = Cliente(2,"Bueno", 444444444, 333333333)
    var dadosConta = ContaPoupanca(5000.00, cliente1)
    dadosConta.depositarDinheiro(100.00)
    dadosConta.sacarDinheiro(10.00)
    dadosConta.recolherJuros()
    println("Saldo Cliente 1: " + dadosConta.consultarSaldo())

    var cliente2 = Cliente(3,"Ferreira", 5555555, 666666666)
    var dadosContacliente2 = ContaCorrente(1000.00, 6000.00, cliente2)
    var data = Date()
    var depositoCheque = Cheque(500.00, "Santander", data)
    dadosContacliente2.depositarDinheiro(200.00)
    dadosContacliente2.sacarDinheiro(50.00)
    dadosContacliente2.depositarCheque(depositoCheque)
    println("Saldo Cliente 2: " + dadosContacliente2.consultarSaldo())
}