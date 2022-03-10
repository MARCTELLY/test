package kocko.clasment

class kokoClass(coco: kokoType, sizing:Int) extends cocoInterface[kokoType]{
  override def getType: kokoType = coco

  override def isPlace(): Boolean = getType == Tree

  override def isTree(): Boolean = getType == Place

  def get_obj(name: String): Unit = println(
      s"votre objet est de type ${getType} et est de taille ${sizing} avec un nom : ${name}"
  )

}
