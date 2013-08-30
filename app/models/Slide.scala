package models

case class Slide(
  id     : Long,
  name   : String,
  elements : List[Element]
) {

}

object Slide extends ((
  Long,
  String,
  List[Slide]
) => Slide) {

  def getById(id:Long):Option[Slide] = None

  def getByName(name:String):List[Slide] = Nil


}