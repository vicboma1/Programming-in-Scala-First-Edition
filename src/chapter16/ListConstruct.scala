package chapter16

/**
 * Created by vicboma on 23/09/14.
 */
object ListConstruct {
  def main (args: Array[String]) {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums  = 1 :: (2 :: (3 :: (4 :: Nil)))
    val diag3 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
    val empty = Nil
    val num = 1 :: 2 :: 3 :: 4 :: Nil
  }
}
