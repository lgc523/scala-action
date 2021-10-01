package dev.spider.basic

//修饰符 private protected public
//默认访问级别 public
object Modifier {
  def main(args: Array[String]): Unit = {
  }
}

class Outer {
  class Inner {
    private def f(): Unit = {
      println("f")
    }

    def All(): Unit = {
      println("everyWhere can invoke")
    }

    class InnerMost {
      f()
      All()
    }
  }
}

//protected 只允许保护成员在定义该成员的子类中被访问
class Super {
  protected def f() {
    println("f")
  }

  class Sub extends Super {
    f()
  }
}

class Other extends Super {
  //  不能够访问
  f()
}

class Another {
  //  (new Super()).f()
}
