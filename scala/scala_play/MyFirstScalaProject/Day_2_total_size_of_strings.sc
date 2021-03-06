object Day_2_total_size_of_strings {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //Use foldLeft to caculate total size of a list of strings
   // The foldLeft() class method creates and returns a curried function.
  
   val myList = List("DDE", "fdsd", "ddccsdgffff", "dfdsdfs")
                                                  //> myList  : List[String] = List(DDE, fdsd, ddccsdgffff, dfdsdfs)
   val res = myList.foldLeft(0)(
   	(running, item) => {
   		running + item.length()
   })                                             //> res  : Int = 25
   
   //Using alternative notation
   val res2 = (0 /: myList){
     (running, item) => {
   		 running + item.size
     }
   }                                              //> res2  : Int = 25
   
}