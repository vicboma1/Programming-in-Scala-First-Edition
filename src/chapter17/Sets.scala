package chapter17

/**
  * Created by vicboma on 24/09/14.
  */
object Sets {
   def main(args: Array[String]) {
     setsImmutable
     setsMutable
   }

   private def setsImmutable {
     val nums = Set(1,2,3,4)
     println("Set(1,2,3,4) = " + nums.toString())
     nums + (5)
     println("nums + (5) = " + nums.toString())
     nums - 3
     println("nums - 3 = " + nums.toString())
     nums ++ List(6,7,8)
     println("nums ++ List(6,7,8) = " + nums.toString())
     nums -- List(1,2)
     println("nums -- List(1,2) = " + nums.toString())
   //  nums ** Set(1, 3, 5, 7)
   //  println("nums ** Set(1, 3, 5, 7) = " + nums.toString())
     println("nums.size = " + nums.size)
     println("nums.contains(1) = " + (nums.contains(1)))
     println("nums.foreach(println) = " +(nums.foreach(println)))
   }

   private def setsMutable {
     val words = scala.collection.mutable.Set.empty[String]
     println("words += (\"one\") = " + (words += ("one")))
     println("words -= \"one\" = " + (words -= "one"))
     println("words ++= List(\"one\", \"two\", \"three\") = " + (words ++= List("one", "two", "three")))
     println("words --= List(\"one\", \"two\") = " + (words --= List("one", "two")))
   }
 }
