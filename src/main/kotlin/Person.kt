//Criando suplesclasse ou classe pai, para poder guardar informacoes para as classes filhas
// utilizando o conceito de heranca
// construtores em kotlin sao criados nos parametros da classe como vemos abaixo
// e o iniciazilador ( init ) e um bloco de codigo que executara junto com o construtor
// nele podemos definir propriedades do construtor, definindo valores aos atributos
// os metodos criados depois do inicializador, serao implementados nas classes filhas
// usamos a palavra chave open para tornar a SuperClasse aberta para implementacao
open class Person(
    var name: String,
    // no construtor primario podemos definir um valor padrao para os atributos
    var age: Int = 0
) {
    init {
        println("The person name: $name")
        println("The person age: $age")
    }

    fun talk() {
        println("$name is talking")
    }

    fun walk() {
        println("$name is walking")
    }

    fun eat() {
        println("$name is eating")
    }
}