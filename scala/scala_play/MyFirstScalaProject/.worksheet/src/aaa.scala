object aaa {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  println("Welcome to the Scala worksheet");$skip(21); 
  println("TDSFFDS");$skip(39); 
  var aaa = List("ee","fdfdsf","gfdr");System.out.println("""aaa  : List[String] = """ + $show(aaa ));$skip(34); 
  for ( x <- aaa) {  println(x) };$skip(40); val res$0 = 
  
  for (i <- List(1,2,3)) yield i * 2;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(41); 
  
  var myList = List(11,2,4,65,32,2,3);System.out.println("""myList  : List[Int] = """ + $show(myList ));$skip(60); 
  var sum = myList.foldLeft(0)((sum, value) => sum + value);System.out.println("""sum  : Int = """ + $show(sum ));$skip(14); val res$1 = 
  myList.head;System.out.println("""res1: Int = """ + $show(res$1));$skip(109); 
  
  var max = myList.foldLeft(myList.head)((max, value) => {
  	if (value > max) value
  	else max
  }
  );System.out.println("""max  : Int = """ + $show(max ));$skip(106); 

  var min = myList.foldLeft(myList.head)((min, value) => {
  	if (value < min) value
  	else min
  }
  );System.out.println("""min  : Int = """ + $show(min ))}
  
}
