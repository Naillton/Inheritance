package Testing

//Criando suplesclasse ou classe pai, para poder guardar informacoes para as classes filhas
// utilizando o conceito de heranca
// construtores em kotlin sao criados nos parametros da classe como vemos abaixo
// e o iniciazilador ( init ) e um bloco de codigo que executara junto com o construtor
// nele podemos definir propriedades do construtor, definindo valores aos atributos
// os metodos criados depois do inicializador, serao implementados nas classes filhas
// usamos a palavra chave open para tornar a SuperClasse aberta para implementacao

/*
    Modificadores de acesso sao usados no Kotlin e em outras linguagens de POO, para conseguirmos
    encapsular nossos atributos de uma forma que apenas o que queremos possa ser visualizado
    existem 4 tipos de modificadores de acesso:
    public -> modificador de acesso padrao, tudo definido como public pode ser acessado por qualquer arquivo do nosso codigo
    private -> so pode ser acessado no arquivo que e definido
    protected -> pode ser acessado no pacote em que e definido
    internal -> mode ser acessado no modulo em que e definido
 */
open class Person(
    protected var name: String,
    // no construtor primario podemos definir um valor padrao para os atributos
    protected var age: Int = 0
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