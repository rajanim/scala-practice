package mark.lewis.scalabasics

/**
  * Created by rajanishivarajmaski1 on 3/11/17.
  */
class TimeConvert {

  def timeConvert(): Unit = {
    val totalSeconds = 123456
    val displaySecs = totalSeconds%60 //obtain reminder of seconds
    val totalMins = totalSeconds/60 // obtain mins
    val displayMin = totalMins%60
    val displayHours = totalMins/60

//val finalString = displayHours+":"+("0"*(2-min.length))+min+
   // ":"+("0"*(2-sec.length))+sec
    println(s"$displayHours : $displayMin : $displaySecs")

  }

}
