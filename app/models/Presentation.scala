package models

case class Presentation(
  id     : Long,
  name   : String,
  slides : List[Slide]
) {

}

object Presentation extends ((
  Long,
  String,
  List[Slide]
) => Presentation) {

  def getById(id:Long):Option[Presentation] = None

  def getByName(name:String):List[Presentation] = Nil


}