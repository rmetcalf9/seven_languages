import scala.io.Source

object filePlay {
	val fileName = "/home/robert/otherGit/seven_languages/rjm/scala/scala_play/MyFirstScalaProject/BadWords.txt"
                                                  //> fileName  : String = /home/robert/otherGit/seven_languages/rjm/scala/scala_p
                                                  //| lay/MyFirstScalaProject/BadWords.txt
                                                  
  var censoredWords = Map[ String, String ]()     //> censoredWords  : scala.collection.immutable.Map[String,String] = Map()
  censoredWords = Source
  		.fromFile(fileName )
  		.getLines
  		.toList
  		.filter(_.count(_ == ',') == 1)
  		.foldLeft(censoredWords) {
  		  (runningResult, mappingLine) =>
  		    {
  		      val terms = mappingLine.split(",")
  		      (runningResult + (terms(0) -> terms(1)))
  		    }
  		}
  		
  		var x = Source
  			.fromFile(fileName)
  			.getLines
  			.toList
				.filter(_.count(_ == ',') == 1)
                                                  //> x  : List[String] = List(darn,shoot, pucky,beans)
  
}