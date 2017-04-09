package mark.lewis.loops

/**
  * Created by rajanishivarajmaski1 on 4/6/17.
  */
class ParallelForLoopsExample {

//(1 to 10).par

  def parallelLoops (): Unit = {
    var i =0
    for(j <- (1 to 1000).par) {
      i+=1
    }

  }


}
