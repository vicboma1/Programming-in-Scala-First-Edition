Examples of Chapter 17
==========

## List
```
(Blue, Yellow, Green)
colors.head = Blue
colors.tail = List(Yellow, Green)
```

## Array
```
1 0 0 0 0
fiveInts = ()
```

## ListBuffer
```
buf.toList = List(1, 2, 3)
```

## ArrayBuffer
```
arrayBuf.length = 2
arrayBuf(0) = 12
arrayBuf.toString = ArrayBuffer(12, 14)
arrayBuf.remove(1) = 14
arrayBuf.toString = ArrayBuffer(12)
```

## Queue Immutable
```
Queue has123 = Queue(1, 2, 3)
val (element, has23) = has123.dequeue
val (element) = 1
val (has23) = Queue(2, 3)
```

## Queue mutable
```
queue.toString = Queue(a, b, c)
queue.dequeue = a
queue.toString = Queue(b, c)
```

## Stack
```
stack = Stack(1)
stack = Stack(2, 1)
stack.top = 2
stack = Stack(2, 1)
stack.pop = 2
stack = Stack(1)
```

##Maps
```
Map(i -> 1,ii -> 2) = Map(i -> 1, ii -> 2)
nums + (vi -> 6) = Map(i -> 1, ii -> 2)
nums - ii = Map(i -> 1, ii -> 2)
nums ++ List(iii -> 3, v -> 5) = Map(i -> 1, ii -> 2)
nums -- List(i,ii) = Map(i -> 1, ii -> 2)
nums.size = 2
nums.contains(ii) = true
nums(ii) = 2
nums.keys = Set(i, ii)
nums.keySet = Set(i, ii)
nums.values = MapLike(1, 2)
nums.isEmpty = false
words += ("one" -> 1) = Map(one -> 1)
words -= "one" = Map()
words ++= List("one" -> 1, "two" -> 2, "three" -> 3) = Map(one -> 1, three -> 3, two -> 2)
words --= List("one", "two") = Map(three -> 3)
nums.foreach(println) = (i,1) /n (ii,2) /n
```

### Set
```
Set(1,2,3,4) = Set(1, 2, 3, 4)
nums + (5) = Set(1, 2, 3, 4)
nums - 3 = Set(1, 2, 3, 4)
nums ++ List(6,7,8) = Set(1, 2, 3, 4)
nums -- List(1,2) = Set(1, 2, 3, 4)
nums.size = 4
nums.contains(1) = true
nums.foreach(println) = () 1 2 3 4
words += ("one") = Set(one)
words -= "one" = Set()
words ++= List("one", "two", "three") = Set(three, two, one)
words --= List("one", "two") = Set(three)
```

## Sort Map and Set
```
TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5) = TreeSet(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
TreeSet('f', 'u', 'n') = TreeSet(f, n, u)

TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x') = Map(1 -> x, 3 -> x, 4 -> x)
tm += (2 -> 'x') = Map(1 -> x, 2 -> x, 3 -> x, 4 -> x)
```

#Synchronized sets and maps
 ```
 creating runnable
 creating runnable
 creating runnable
 creating runnable
 {four=4, one=1, new value=44, two=2, three=3, five=5}
 Map {four=4, one=1, new value=44, two=2, three=3, five=5}
 Map {four=4, one=1, new value=44, two=2, three=3, five=5}
 Map {four=4, one=1, new value=44, two=2, three=3, five=5}
 Map {four=4, one=1, new value=44, two=2, three=3, five=5}
 ```
 