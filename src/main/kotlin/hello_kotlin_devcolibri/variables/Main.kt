package hello_kotlin_devcolibri.variables

fun main(args: Array<String>) {

    //lesson 1

    var name: String = "Alex"
    println("Hello $name! \$name")
    var a: Int = 1
    var b: Int = 2
    println("A + B = ${a + b}")

    //lesson 2

    var userJava = UserJava("elena.briginets@gmail.com")
    println("Java example: ${userJava.email}")
    var userKotlin = UserKotlin("elena.briginets@gmail.com")
    println("Kotlin example: ${userKotlin.email}")

    val val_1: String = "variable immutable"
    var var_1: String = "variable mutable"

    //lesson 3

    var v0: Char = 'm'
    var v1: String = "var string"
    var v2: Byte = 8
    var v3: Short = 16
    val v4: Int = 32
    var v5: Long = 64
    var v6: Double = .64 //64
    var v7: Float = .32F //32
    var v8: Boolean = true

    var b1: Long = v4.toLong()

}
