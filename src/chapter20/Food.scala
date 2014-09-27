package chapter20

import chapter12.Animal

/**
 * Created by vicboma on 27/09/14.
 */
trait Food {
  abstract class Animal{
    def eat(food:Food)
  }
}

class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  def eat(food: Grass) {}
}


class Fish extends Food {
//  val bessy: Animal = new Cow
//  bessy.eat(new Fish) // ...you could feed fish to cows.
}

class DogFood extends Food
class Dog extends Animal {
  type SuitableFood = DogFood
  //override def eat(food: DogFood) {}
}