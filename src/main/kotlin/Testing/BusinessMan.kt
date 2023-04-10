package Testing

// implementando os metodos e atributos da classe pai na classe filha
// note que nao utilizamos nenhum modificador de acesso ou declaracao de val ou var no construtor da classe filha
// nem na classe pai
class BusinessMan(name: String, age: Int): Person(name, age) {

    // methodos de acesso getters e setters servem para acessar valores ou setar valores
    // sem acessar ou modificar diretamente os atributos mantendo o encapsulamento
    fun getNameB(): String {
        return this.name;
    }

    fun setNameB(name: String) {
        this.name = name;
    }

    fun getAgeB(): Int {
        return this.age;
    }

    fun setAgeB(age: Int) {
        this.age = age;
    }
}