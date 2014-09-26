package chapter19

/**
 * Created by vicboma on 26/09/14.
 */
class QueueParameterization[+T] private (private[this] var leading: List[T], private[this] var trailing: List[T]) {

  private def mirror() =
    if (leading.isEmpty) {
      while (!trailing.isEmpty) {
        leading = trailing.head :: leading
        trailing = trailing.tail
      }
    }

  def head: T = {
    mirror()
    leading.head
  }

  def tail: QueueParameterization[T] = {
    mirror()
    new QueueParameterization(leading.tail, trailing)
  }

  def append[U >: T](x: U) =
    new QueueParameterization[U](leading, x :: trailing)
}


