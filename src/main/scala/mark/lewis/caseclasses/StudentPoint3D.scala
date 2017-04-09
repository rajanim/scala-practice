package mark.lewis.caseclasses

/**
  * Created by rajanishivarajmaski1 on 4/7/17.
  */
case class Point3D(x:Double, y:Double, z:Double)

case class Student(name:String, tests:List[Int], assns:List[Int],
                   quizzes: List[Int])


class StudentPoint3D{

  def distance(p1: Point3D, p2: Point3D) : Double = {
  val dx = p1.x - p2.x
    val dy = p1.y - p2.y
    val dz = p1.z - p2.z

    Math.sqrt(dx+dy+dz)

  }
  }



