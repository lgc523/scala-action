package dev.spider.basic

//single object
//scala 不存在静态成员，使用 single object 中的成员来代替静态成员
object Hello {
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
