object aaa {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println("TDSFFDS")                              //> TDSFFDS
  var aaa = List("ee","fdfdsf","gfdr")            //> aaa  : List[String] = List(ee, fdfdsf, gfdr)
  for ( x <- aaa) {  println(x) }                 //> ee
                                                  //| fdfdsf
                                                  //| gfdr
  
  for (i <- List(1,2,3, 4)) yield i * 2           //> res0: List[Int] = List(2, 4, 6, 8)
  
  var myList = List(11,2,4,65,32,2,3)             //> myList  : List[Int] = List(11, 2, 4, 65, 32, 2, 3)
  myList.foldLeft(0)((sum, value) => {
  	//println(value)
  	value
  })                                              //> res1: Int = 3
  
  
  var sum = myList.foldLeft(0)((sum, value) => sum + value)
                                                  //> sum  : Int = 119
  myList.head                                     //> res2: Int = 11
  
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
  
  for (i <- List(1,2,3)) println(i)               //> 1
                                                  //| 2
                                                  //| 3
                                                  
  var strs = List("A","AA","B","11")              //> strs  : List[String] = List(A, AA, B, 11)
  strs.foldRight("")(    (prev_val, item) => {
    item + prev_val
  }
  )                                               //> res3: String = 11BAAA
}