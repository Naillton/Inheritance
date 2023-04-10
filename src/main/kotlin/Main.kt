import Testing.BusinessMan
import Testing.Person
import Testing.Player
import Testing.Teacher

//Apos instanciar as nossas classes filhas o init ja e chamado nos devolvendo o nome e a idade das pessoas
//faca o teste e comente as chamadas dos metodos
fun main() {
    val player = Player("John", 21)
    player.eat()
    player.setAgeP(22)
    val myNameP: String = player.getNameP()
    val myAgeP: Int = player.getAgeP()
    println("Ola me chamo $myNameP e tenho $myAgeP de idade")
    println("---------------------------------------------")
    val teacher = Teacher("Java", 40)
    teacher.talk()
    teacher.setAgeT(34)
    val myNameT: String = teacher.getNameT()
    val myAgeT: Int = teacher.getAgeT()
    println("Ola me chamo $myNameT e tenho $myAgeT de idade")
    println("---------------------------------------------")
    val busiMan = BusinessMan("Important",50)
    busiMan.walk()
    busiMan.setAgeB(55)
    val myNameB: String = busiMan.getNameB()
    val myAgeB: Int = busiMan.getAgeB()
    println("Ola me chamo $myNameB e tenho $myAgeB de idade")
    println("---------------------------------------------")
}