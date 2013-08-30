package models

case class Checkbox(
  id:Long,
  name:String
  checked:Boolean
) extends Element 

object Checkbox extends ((
  Long,
  String,
  List[Slide]
) => Checkbox) {

  def getById(id:Long):Option[Checkbox] = None

  def getByName(name:String):List[Checkbox] = Nil

  def toJson(checkbox:Checkbox):JsValue = Json.toJson(checkbox)

  def fromJson(json:JsValue):Option[Checkbox] = {
    try {
      Json.fromJson(json).get
    } catch {
      case e:Exception => None
    }
  }
}