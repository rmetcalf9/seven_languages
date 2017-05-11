object aaa {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println("TDSFFDS")                              //> TDSFFDS
  var aaa = List("ee","fdfdsf","gfdr")            //> aaa  : List[String] = List(ee, fdfdsf, gfdr)
  for ( x <- aaa) {  println(x) }                 //> ee
                                                  //| fdfdsf
                                                  //| gfdr
  
  for (i <- List(1,2,3)) yield i * 2              //> res0: List[Int] = List(2, 4, 6)
  
  var myList = List(11,2,4,65,32,2,3)             //> myList  : List[Int] = List(11, 2, 4, 65, 32, 2, 3)
  var sum = myList.foldLeft(0)((sum, value) => sum + value)
                                                  //> sum  : Int = 119
  myList.head                                     //> res1: Int = 11
  
  var max = myList.foldLeft(myList.head)((max, value) => {
  	if (value > max) value
  	else max
  }
  )                                               //> max  : Int = 65

  var min = myList.foldLeft(myList.head)((min, value) => {
  	if (value < min) value
  	else min
  }
  )                                               //> min  : Int = 2
  
}