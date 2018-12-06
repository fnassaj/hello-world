import java.awt.Rectangle;
import java.lang.reflect.Field;

//Test   sdf
public class MainClass2 {

  public static void main(String[] args) {
    Rectangle rec = new Rectangle(100, 325);
    Class recClass = rec.getClass();
    try {
      Field heightField = recClass.getField("height");
      Integer heightValue = (Integer) heightField.get(rec);
      System.out.println("Height: " + heightValue.toString());
    } catch (NoSuchFieldException e) {
      System.out.println(e);
    } catch (SecurityException e) {
      System.out.println(e);
    } catch (IllegalAccessException e) {
      System.out.println(e);
    }
  }
}