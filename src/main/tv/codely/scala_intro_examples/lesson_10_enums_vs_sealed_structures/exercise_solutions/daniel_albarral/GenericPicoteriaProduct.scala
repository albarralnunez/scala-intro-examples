package tv.codely.scala_intro_examples.lesson_10_enums_vs_sealed_structures.exercise_solutions.daniel_albarral

import java.util.UUID

trait PicoteriaProduct {
  val id: UUID
}

trait GenericFood extends Ordered[GenericFood] {

  val forcefulness: Int
  val fatLevel: String

  override def compare(that: GenericFood): Int = that.forcefulness - forcefulness

}
