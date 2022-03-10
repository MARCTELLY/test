package kocko.clasment

trait cocoInterface[SomeType] {
  def getType: SomeType

  def isTree(): Boolean

  def isPlace(): Boolean

}