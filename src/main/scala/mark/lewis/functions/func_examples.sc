def square (x: Double) : Double = x*x
square(3)
def g(x: Int, y:Int):Int = x + y*y
g(3,5)

val a = 2
g(a+2, square(3).toInt)

def courseAverage(test1:Double,test2:Double,assn1:Double,
                  assn2:Double,assn3:Double,quiz1:Double,quiz2:Double,
                  quiz3:Double,quiz4:Double):Double = {
  val testAve = (test1+test2)/2
  val assnAve = (assn1+assn2+assn3)/3
  val minQuiz = quiz1 min quiz2 min quiz3 min quiz4
  val quizAve = (quiz1+quiz2+quiz3+quiz4-minQuiz)/3
  testAve*0.4+assnAve*0.4+quizAve*0.2
}


def plus5(x:Double) : Double = x+5


//def compose(f:Double => Double, k:Double => Double):Double  =>
//Double = x =>

//val h = compose(plus5(),square())

val f = (x:Double,y:Double)=>math.sqrt(x*x+y*y)

def doThreeTimes(g:(Double)=>Double,x:Double) = g(g(g(x)))
def doTwoTimes(f:(Double)=>Double,g:Double) = f(f(g))

def incChar(c:Char,offset:Int) = (c+offset).toChar

incChar('c', 2)

def tnp1(n:Int):(Int,Int) = {
  val odd = n%2
  (n/2*(1-odd),(3*n-1)*odd)
}
tnp1(4)