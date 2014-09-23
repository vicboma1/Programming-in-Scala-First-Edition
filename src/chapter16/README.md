Examples of Chapter 16
==========

## ListGeneric
```
true
false
apples
oranges
List(1, 0, 0)
apples oranges pears
apples oranges List(pears)
```

## Sort
```
List(0, 3, 1, 22, 99, 99, 22, 3, 1, 0)
sort: List(0, 0, 1, 1, 3, 3, 22, 22, 99, 99) 272ms

List(0, 3, 1, 22, 99, 99, 22, 3, 1, 0)
sortMatch: List(0, 0, 1, 1, 3, 3, 22, 22, 99, 99) 0ms
```

## First Order
```
List(1, 2, 3, 4, 5)
List(1, 2, 3)
List(1, 2, 3, 4)
append: List(1, 2, 3, 4, 5, 6) assert: true
List(1, 2, 3) length: 3
List('a', 'b', 'c', 'd', 'e') last: e
List('a', 'b', 'c', 'd', 'e') init: List(a, b, c, d)
List('a', 'b', 'c', 'd', 'e') reverse: List(e, d, c, b, a) 0
List(e, d, c, b, a) 1
abcde take 2 = List(a, b)
abcde drop 2 = List(c, d, e)
abcde splitAt 2 = (List(a, b),List(c, d, e))
abcde.indices zip abcde = Vector((0,a), (1,b), (2,c), (3,d), (4,e))
abcde zip List(1, 2, 3) = List((a,1), (b,2), (c,3))
abcde.zipWithIndex = List((a,0), (b,1), (c,2), (d,3), (e,4))
abcde.toString = List(a, b, c, d, e)
abcde mkString ("List(", ", ", ")") = List(a, b, c, d, e)
[C@279ad2e3
List(a, b, c, d, e)
```

## Merge sort
```
List(1, 3, 5, 7)
<function1>
<function1>
List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
List(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
```

## Higher Order
```
List(1, 2, 3) map (_ + 1) = List(2, 3, 4)
List(the, quick, brown, fox) -  words map (_.length) = List(3, 5, 5, 3)
words map (_.toList.reverse.mkString) = List(eht, kciuq, nworb, xof)
words map (_.toList) = List(List(t, h, e), List(q, u, i, c, k), List(b, r, o, w, n), List(f, o, x))
words flatMap (_.toList) = List(t, h, e, q, u, i, c, k, b, r, o, w, n, f, o, x)
List(1,2,3,4,5,6).filter(x => x%2 == 0) = List(2, 4, 6)
List(1,2,3,4,5,6).filter(_%2 == 0) = List(2, 4, 6)
words.filter(_.length == 3) = List(the, fox)
List(1,2,3,4,5,6).partition(_%3 == 0) = (List(3, 6),List(1, 2, 4, 5))
List[0] = List(3, 6) List[1] = List(1, 2, 4, 5)
List(1,2,3,4,5,6).find(_%3 == 0) = Some(3)
List(1, 2, 3, -4, 5) takeWhile (_ > 0) = List(1, 2, 3)
List(1, 2, 3, -4, 5) dropWhile (_ > 0) = List(-4, 5)
List(1, 2, 3, -4, 5) span (_ > 0) = (List(1, 2, 3),List(-4, 5))
List(1, -3, 4, 2, 6).sortWith(_ < _) = List(-3, 1, 2, 4, 6)
```

## List Object Method
```
List.apply(1, 2, 3) = List(1, 2, 3)
List.range(1, 5) = List(1, 2, 3, 4)
List[List[Char]] = List(List(a, b), List(c), List(d, e))
List[Char] = List(a, b, c, d, e)
```

