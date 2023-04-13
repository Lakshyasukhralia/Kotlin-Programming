package learning

fun main(){
    val list1 = listOf(Student("1", "name1"), Student("2", "name2"))
    val list2 = listOf(Student("1", "name1"), Student("2", "name2"))

    val sum = list1 + list2
    val elem = sum.groupBy { it.id }
        .filter { it.value.size == 1 }
        .flatMap { it.value }
    println(elem)
}

data class Student(val id:String,val name:String)