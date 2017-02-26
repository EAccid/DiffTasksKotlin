package hello_kotlin_devcolibri.functions

fun main(args: Array<String>) {
    //lesson 4

    println(
            "functions results:" +
                    " ${functionWithoutArgsAdnWithReturn()}," +
                    " ${functionWithArgsAdnWithReturn(5)}"
    )
    testFunction()
    val result = testWithArgs(5, 8.5)
    println("Single-Expression functions result $result")

    //lesson 5

    val st: String = "hello"
    val size = st.length
    println(size)

    val st1: String
    st1 = getSt()
    val size1 = st1.length
    println("size1 $size1")

    //? means function can return null
    val st2: String?
    st2 = getStNull()
//    val size2 = st2!!.length // KotlinNullPointerException
//    println("size2 $size2")

    val size3 = st2?.length // returns null
    println("size3 $size3")

    getStWithThrowExceptin()

}

fun getSt(): String {
    return "hello from function"
}

//Null Safety
//? means function can return null
fun getStNull(): String? {
    return null
}

//Null Unsafely
fun getStWithThrowExceptin(): String {
    throw KotlinNullPointerException()
    return "hello from function"
}

fun functionWithoutArgsAdnWithReturn(): Int {
    return 1
}

fun functionWithArgsAdnWithReturn(arg: Int): Long {
    return arg.toLong()
}

fun testFunction() {
    println("Just void function")
}

fun testWithArgs(a: Long, b: Double) = a + b
