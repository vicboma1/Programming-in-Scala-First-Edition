Examples of Chapter 20
==========

## Rational Trait
```
val x = 2

    val rationalTrait = new {
      val numerArg = 1 * x
      val denomArg = 2 * x
    } with RationalTrait

1/2

    new RationalTrait {
      override val denomArg: Int = 1
      override val numerArg: Int = 2
      
Exception in thread "main" java.lang.IllegalArgumentException: requirement failed
	at scala.Predef$.require(Predef.scala:207)
	at chapter20.RationalTrait$class.$init$(RationalTrait.scala:28)
	at chapter20.rationalMain$$anon$2.<init>(RationalTrait.scala:18)
	at chapter20.rationalMain$.main(RationalTrait.scala:18)
	at chapter20.rationalMain.main(RationalTrait.scala)
```

## Demo
```
Demo chapter20.Demo$@43d7741f
Demo.x done

```

## Lazy Rational
```
val rationalTraitLazy = new LazyRationalTrait {
      val numerArg = 1 * x
      val denomArg = 2 * x
    }
   
   1/2

    val rationalTrait = new {
      val numerArg = 1 * x
      val denomArg = 2 * x
    } with LazyRationalTrait
    
    1/2
    
```

## Enumeration
```
North
East
South
West
```

##Currency
```
currencyJapan = 12110 JPY
currencyEurope = 75.95 EUR
currencyUS = 99.95 USD
US.Dollar * 100 + currencyUS = 199.95 USD
```

