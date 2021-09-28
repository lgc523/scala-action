package dev.spider

object HelloWorld {
  def main(args: Array[String]) {
    //变量，类型在等号之前声明
    var a: Int = 3
    //不使用编辑器会建议定义成常量，没有go约束强
    a = a + 2
    //常量
    val s: String = "hello " + a + " scala"
    println(a)
    println(s)
    print("Hello\tworld\n\n")

    //多变量声明
    val b, c = 5
    //元组
    //    trl: {Int, Int} = {s,a}
    val trl = (b, c)
    println(trl)
  }
}
